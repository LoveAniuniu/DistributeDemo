package com.learning.DistributeDemo.thread;

/**
 * @CLassName ExtendThread
 * @Desription TODO
 * @Auther wanghaoab
 * @Date 2019/12/4 12:31 ����
 * @Version 1.0
 */
public class ExtendThread extends Thread {


    @Override
    public void run() {
        System.out.println("这是一个线程");
    }

    public static void main(String[] args) {
        ExtendThread extendThread1 = new ExtendThread();
        ExtendThread extendThread2 = new ExtendThread();
        extendThread1.start();
        extendThread2.start();
    }
}
