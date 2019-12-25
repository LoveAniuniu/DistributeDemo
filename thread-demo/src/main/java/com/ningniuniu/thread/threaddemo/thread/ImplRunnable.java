package com.ningniuniu.thread.threaddemo.thread;

/**
 * @CLassName ImplRunnable
 * @Desription TODO
 * @Auther wanghaoab
 * @Date 2019/12/4 12:43 上午
 * @Version 1.0
 */
public class ImplRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("这是一个线程");
    }

    public static void main(String[] args) {
        ImplRunnable implRunnable1 = new ImplRunnable();
        ImplRunnable implRunnable2 = new ImplRunnable();

        implRunnable1.run();
        implRunnable2.run();
    }
}
