package MULTITHREAD;

public class Java_MULTITHREAD_MainThread {
    public static void main (String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("The current thread name is: " + t);

        t.setName("Main Thread");
        System.out.println("The name of the current thread after applying a \"setName\" method is: " + t);

        System.out.println("The name of the current thread buy using a \"getName\" method is: " + t.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Main thread interrupted. " + e);
        }
    }
}
