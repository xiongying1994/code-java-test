package importantCode.junzong;

import java.io.PrintStream;

/**
 * 测试线程相关信息
 * 1、ThreadLocal 存储线程中的比较对象，保证线程安全，一般用static修饰，一个线程只有一个ThreadLocal对象
 * 2、
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    threadLocal.set(i);
                    System.out.println(Thread.currentThread().getName() + "====" + threadLocal.get());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                threadLocal.remove();
            }
        }, "threadLocal1").start();


        new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "====" + threadLocal.get());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                threadLocal.remove();
            }
        }, "threadLocal2").start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 0; i < 100; i++) {
                                System.out.println(Thread.currentThread().getName() + "====" + threadLocal.get());
                                try {
                                    Thread.sleep(300);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        } finally {
                            threadLocal.remove();
                        }
                    }
                },""
        ).start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("aaaaaaaaa");
                }
            }
        }.start();

        Thread a = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("aaaaaaaaa");
                }
            }
        };
        a.start();

        PrintStream out = System.out;
        Runnable b = () -> out.println(" ");
    }
}
