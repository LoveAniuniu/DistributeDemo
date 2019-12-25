# 多线程
### java实现多线程的方式
    java实现多线程方式有三种：
    1、继承Thread类
    2、实现Runnable接口
    3、使用ExtcutorService、Callable、Future实现带返回值的多线程。

 ### 线程生命周期
    线程生命周期6中状态（NEW, RUNNABLE,BLOCKED,WATING,TIME_WATING,TERMINATED）
    1、NEW：初始状态，线程被构建，但是还没有调用 start 方法
    2、RUNNABLED：运行状态，JAVA 线程把操作系统中的就绪
      和运行两种状态统一称为“运行中”
    3、BLOCKED：阻塞状态，表示线程进入等待状态,也就是线程
      因为某种原因放弃了 CPU 使用权，阻塞也分为几种情况
      ➢ 等待阻塞：运行的线程执行 wait 方法，jvm 会把当前
      线程放入到等待队列
      同步阻塞：运行的线程在获取对象的同步锁时，若该同
      步锁被其他线程锁占用了，那么 jvm 会把当前的线程
      放入到锁池中
      ➢ 其他阻塞：运行的线程执行 Thread.sleep 或者 t.join 方
      法，或者发出了 I/O 请求时，JVM 会把当前线程设置
      为阻塞状态，当 sleep 结束、join 线程终止、io 处理完
      毕则线程恢复
    4、TIME_WAITING：超时等待状态，超时以后自动返回
    5、TERMINATED：终止状态，表示当前线程执行完毕