package MULTITHREAD;

public class Java_MULTITHREAD_isAlive implements Runnable {

    public static String is_AliveGeneralForm = "The general form of \"isAlive()\" method is: \n\tfinal boolean isAlive().";
    String threadName;
    Thread t;

    Java_MULTITHREAD_isAlive (String thName) {
        threadName = thName;
        t = new Thread (this, threadName);
        System.out.println("New thread: " + t);
    }

    public void run() {
        System.out.println(is_AliveGeneralForm);
        System.out.println();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + t.getName() + " continence: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread " + t.getName() + " exception " + e);
        }
        System.out.println();
        System.out.println("Exiting from thread " + t.getName());
    }
}