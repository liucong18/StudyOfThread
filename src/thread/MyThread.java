package thread;

/**
 * 创建线程的方式一：继承Thread类，重写run方法
 * @author liucong
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("吃着火锅1");
        }
    }
}
