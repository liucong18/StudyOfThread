package runnable;

/**
 * 多线程的创建方式二 实现Runnable接口，重写run方法
 * @author liucong
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("吃着火锅2");
        }
    }
}
