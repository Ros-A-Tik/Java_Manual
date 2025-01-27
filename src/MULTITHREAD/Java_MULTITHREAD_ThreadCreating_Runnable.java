package MULTITHREAD;

public class Java_MULTITHREAD_ThreadCreating_Runnable implements Runnable {

    Thread t;

    Java_MULTITHREAD_ThreadCreating_Runnable() {
        t = new Thread(this, "Second Thread");
        System.out.println("The second thread is: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Second thread contains: " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            System.out.println("Second tread exception: " + e);
        }
        System.out.println("Exiting second thread.");
    }
}
