package com.ningniuniu.thread.threaddemo.thread;


import static java.util.concurrent.TimeUnit.*;

/**
 * @CLassName InterruptDemo
 * @Desription TODO
 * @Auther wanghaoab
 * @Date 2019/12/5 12:20 上午
 * @Version 1.0
 */
public class InterruptDemo {

    private static int i;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(
                ()->{
                    while (!Thread.currentThread().isInterrupted()) {
                        i++;
                    }

                    System.out.println("num"+i);
                }
        ,"interruptDemo");

        thread.start();
        SECONDS.sleep(1);

        thread.interrupt();
    }

}
