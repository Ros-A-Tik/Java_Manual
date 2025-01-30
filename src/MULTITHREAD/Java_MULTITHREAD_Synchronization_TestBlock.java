package MULTITHREAD;

public class Java_MULTITHREAD_Synchronization_TestBlock {
    public static void main (String[] args) {
        Java_MULTITHREAD_Synchronization_CallBlock target = new Java_MULTITHREAD_Synchronization_CallBlock();
        Java_MULTITHREAD_Synchronization_CallerBlock th_1 = new Java_MULTITHREAD_Synchronization_CallerBlock (target, "Hello");
        Java_MULTITHREAD_Synchronization_CallerBlock th_2 = new Java_MULTITHREAD_Synchronization_CallerBlock (target, "Synchronized");
        Java_MULTITHREAD_Synchronization_CallerBlock th_3 = new Java_MULTITHREAD_Synchronization_CallerBlock (target, "World");

        th_1.th.start();
        th_2.th.start();
        th_3.th.start();

        try {
            th_1.th.join();
            th_2.th.join();
            th_3.th.join();
        }catch (Exception e) {
            System.out.println("Interrupted " + e);
        }

    }
}
