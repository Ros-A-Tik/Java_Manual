package MULTITHREAD;

public class Java_MULTITHREAD_Synchronization_Test {
    public static void main (String[] args) {
        Java_MULTITHREAD_Synchronization_Call target = new Java_MULTITHREAD_Synchronization_Call();
        Java_MULTITHREAD_Synchronization_Caller th_1 = new Java_MULTITHREAD_Synchronization_Caller (target, "Hello");
        Java_MULTITHREAD_Synchronization_Caller th_2 = new Java_MULTITHREAD_Synchronization_Caller (target, "Synchronized");
        Java_MULTITHREAD_Synchronization_Caller th_3 = new Java_MULTITHREAD_Synchronization_Caller (target, "World");

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
