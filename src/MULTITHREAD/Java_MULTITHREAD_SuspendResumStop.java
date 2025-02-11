package MULTITHREAD;

public class Java_MULTITHREAD_SuspendResumStop implements Runnable {
    public static String name;
    Thread t;
    public static boolean flag;

    Java_MULTITHREAD_SuspendResumStop (String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Nea thread name is: " + name);
        flag = false;
    }

    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while(flag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    synchronized void suspend() {
        flag = true;
    }

    synchronized  void resume() {
        flag = false;
        notify();
    }

}