package MULTITHREAD;

public class Java_MULTITHREAD_Synchronization_CallBlock {
    synchronized void call (String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Interrupted " + e);
        }
        System.out.println(" ]");
    }

}
