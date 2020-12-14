package com.example;

import com.example.tasks.Mytask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncSpringApplicationTest {
    @Autowired
    private Mytask mytask;

    /*
    ��һ���첽���úܿ��ܲ������κ�����ִ�еĽ�����أ���Ϊ
    ĿǰdoTaskOne��doTaskTwo��doTaskThree��������
    ��ʱ���Ѿ����첽ִ���ˡ����������첽����֮��������
    ��������������������Ƿ�ִ������ˣ�����û��������Ҫ
    ִ�е����ݣ����Գ�����Զ������ˣ������˲���������û
    ���������������ݵ������
     */
    /*
    ������ͨ���̳߳�ʵ���첽����
     */
    @Test
    public void test1() throws Exception {
        mytask.doTaskOne();
        mytask.doTaskTwo();
        mytask.doTaskThree();
//        Thread.currentThread().join();
    }

    /*
    �ڶ���ͨ������Future��������첽����
     */
    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = mytask.doAnotherTaskOne();
        Future<String> task2 = mytask.doAnotherTaskTwo();
        Future<String> task3 = mytask.doAnotherTaskThree();

        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // �������񶼵�����ɣ��˳�ѭ���ȴ�
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        System.out.println("����ȫ����ɣ��ܺ�ʱ��" + (end - start) + "����");

    }
}
