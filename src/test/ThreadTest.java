package test;

import callable.MyCallable;
import runnable.MyRunnable;
import thread.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程测试类
 * @author liucong
 */
public class ThreadTest {

    public static void main(String[] arge) {
        //1.测试Thread类
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("唱着歌1");
        }

        //2.测试Runnable接口
        MyRunnable myRunnable = new MyRunnable();
        //创建代理线程对象
        Thread thread = new Thread(myRunnable);
        thread.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("唱着歌2");
        }

        //3.测试Callable接口
        MyCallable myCallable = new MyCallable();
        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收结果。
        FutureTask<Boolean> futureTask = new FutureTask<>(myCallable);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        try {
            Boolean result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println("唱着歌3");
        }
    }
}
