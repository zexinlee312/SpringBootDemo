package com.example.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("file")
public class FileController {
    @PostMapping("upload")
    public String MyUpload(MultipartFile myup, HttpServletRequest request) throws IOException {
        //输出文件的原始信息
        System.out.println(myup.getOriginalFilename());
        System.out.println(myup.getContentType());
        System.out.println(myup.getSize());

        //文件上传,路径采用的是内嵌TOMCAT创建的files文件夹，不好找
        //String path = request.getServletContext().getRealPath("/files");
        //文件上传，采用项目中的路径
        String path = ResourceUtils.getURL("classpath:").getPath()+"static/files";
        //System.out.println(path);
        String dateDir = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        File dir = new File(path,dateDir);
        if (!dir.exists()) dir.mkdir();
        String newPrefix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ UUID.randomUUID().toString();
        String extension = FilenameUtils.getExtension(myup.getOriginalFilename());
        String newFileName = newPrefix+"."+extension;
        myup.transferTo(new File(dir,newFileName));
        return "redirect:/";
    }

    /**
     * 文件下载
     * @param response
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping("/download")
    public void downLoad(String fileName,HttpServletResponse response) throws IOException {
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "static/files";
        File file = new File(realPath, fileName);
        FileInputStream is = new FileInputStream(file);
        //attachment附件形式,content-disposition文件丁文
        response.setHeader("content-disposition","attachment;fileName="+fileName);
        ServletOutputStream os = response.getOutputStream();
        int len = 0;
        byte[] b = new byte[1024];
        while(true) {
            len = is.read(b);
            if (len == -1) break;
            os.write(b,0,len);
        }
        is.close();
        os.close();
    }
}
