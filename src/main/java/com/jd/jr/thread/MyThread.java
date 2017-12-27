package com.jd.jr.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by jiangzhenghui on 2017/12/27
 */
public class MyThread extends Thread {

    private Logger log = LoggerFactory.getLogger(MyThread.class);

    @Override
    public void run() {
        try {
            System.out.println("线程开始，时间：" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("线程结束，时间：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new MyThread());
//        executorService.shutdown();
        executorService = null;
    }

}
