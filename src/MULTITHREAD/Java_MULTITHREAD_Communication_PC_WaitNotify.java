package MULTITHREAD;

public class Java_MULTITHREAD_Communication_PC_WaitNotify {
    public static void main (String[] agrs) {

        Java_MULTITHREAD_Communication_Q_WaitNotify q = new Java_MULTITHREAD_Communication_Q_WaitNotify();

        Java_MULTITHREAD_Communication_Producer_WaitNotify p = new Java_MULTITHREAD_Communication_Producer_WaitNotify(q);
        Java_MULTITHREAD_Communication_Consumer_WaitNotify c = new Java_MULTITHREAD_Communication_Consumer_WaitNotify(q);

        p.th.start();
        c.th.start();

        System.out.println("Press CNTR+C to stop");
    }
}
