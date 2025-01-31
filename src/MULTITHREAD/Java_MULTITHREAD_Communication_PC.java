package MULTITHREAD;

public class Java_MULTITHREAD_Communication_PC {
    public static void main (String[] agrs) {

        Java_MULTITHREAD_Communication_Q q = new    Java_MULTITHREAD_Communication_Q();

        Java_MULTITHREAD_Communication_Producer p = new Java_MULTITHREAD_Communication_Producer(q);
        Java_MULTITHREAD_Communication_Consumer c = new Java_MULTITHREAD_Communication_Consumer(q);

        p.th.start();
        c.th.start();

        System.out.println("Press CNTR+C to stop");
    }
}
