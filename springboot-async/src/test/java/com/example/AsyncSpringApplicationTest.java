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
    第一：异步调用很可能不会有任何人物执行的结果返回，因为
    目前doTaskOne、doTaskTwo、doTaskThree三个函数
    的时候已经是异步执行了。主程序在异步调用之后，主程序
    并不会理会这三个函数是否执行完成了，由于没有其他需要
    执行的内容，所以程序就自动结束了，导致了不完整或是没
    有输出任务相关内容的情况。
     */
    /*
    第三：通过线程池实现异步调用
     */
    @Test
    public void test1() throws Exception {
        mytask.doTaskOne();
        mytask.doTaskTwo();
        mytask.doTaskThree();
//        Thread.currentThread().join();
    }

    /*
    第二：通过返回Future类型完成异步调用
     */
    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = mytask.doAnotherTaskOne();
        Future<String> task2 = mytask.doAnotherTaskTwo();
        Future<String> task3 = mytask.doAnotherTaskThree();

        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

    }
}
