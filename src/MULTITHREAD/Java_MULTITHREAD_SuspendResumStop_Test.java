package MULTITHREAD;

public class Java_MULTITHREAD_SuspendResumStop_Test {

    public static void main (String[] args) {
        Java_MULTITHREAD_SuspendResumStop th_1 = new Java_MULTITHREAD_SuspendResumStop("One");
        Java_MULTITHREAD_SuspendResumStop th_2 = new Java_MULTITHREAD_SuspendResumStop("Two");

        th_1.t.start();
        th_2.t.start();

        System.out.println(th_1.t.getState());

        try {
            Thread.sleep(1000);
            th_1.suspend();
            System.out.println("Suspending Thread \"th_1\"");
            Thread.sleep(1000);
            th_1.resume();
            System.out.println("Resuming Thread \"th_1\"");
            System.out.println();

            Thread.sleep(1000);
            th_2.suspend();
            System.out.println("Suspending Thread \"th_2\"");
            Thread.sleep(1000);
            th_2.resume();
            System.out.println("Resuming Thread \"th_2\"");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            System.out.println("Waiting for finish");
            th_1.t.join();
            th_2.t.join();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("Main thread exiting");
    }
}