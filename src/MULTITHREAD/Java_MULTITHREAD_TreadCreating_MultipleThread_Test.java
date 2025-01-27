package MULTITHREAD;

public class Java_MULTITHREAD_TreadCreating_MultipleThread_Test {

    public static void main (String[] args) {

        Java_MULTITHREAD_TreadCreating_MultipleThread th_1 = new Java_MULTITHREAD_TreadCreating_MultipleThread("one");
        Java_MULTITHREAD_TreadCreating_MultipleThread th_2 = new Java_MULTITHREAD_TreadCreating_MultipleThread("two");
        Java_MULTITHREAD_TreadCreating_MultipleThread th_3 = new Java_MULTITHREAD_TreadCreating_MultipleThread("three");

        th_1.t.start();
        th_2.t.start();
        th_3.t.start();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("The Main thread exception is: " + e);
        }
        System.out.println("Exiting from the Main thread");
    }
}