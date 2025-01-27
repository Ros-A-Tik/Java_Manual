package MULTITHREAD;

public class Java_MULTITHREAD_TreadCreating_Thread_Extending extends Thread {

    Java_MULTITHREAD_TreadCreating_Thread_Extending() {
        super("Second Thread");
        System.out.println("The Second thread name is: " + this);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("The Second thread continence: " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Second thread exception ia: " + e);
        }
        System.out.println("Exiting from Second thread");
    }
}
