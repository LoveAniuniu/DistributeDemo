package com.learning.DistributeDemo.thread;

import java.util.concurrent.*;

/**
 * @CLassName CallableDemo
 * @Desription TODO
 * @Auther wanghaoab
 * @Date 2019/12/4 12:45 上午
 * @Version 1.0
 */
public class CallableDemo implements Callable<String> {


    @Override
    public String call() throws Exception {

        int a = 1;
        int b = 2;
        System.out.println(a+b);
        return "执行结果："+(a+b);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);

        System.out.println(future.get());
        executorService.shutdown();
    }
}
