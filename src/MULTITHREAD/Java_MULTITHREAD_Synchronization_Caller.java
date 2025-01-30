package MULTITHREAD;

public class Java_MULTITHREAD_Synchronization_Caller implements Runnable {
    String msg;
    Java_MULTITHREAD_Synchronization_Call target;
    Thread th;

    public Java_MULTITHREAD_Synchronization_Caller (Java_MULTITHREAD_Synchronization_Call targ, String str) {
        target = targ;
        msg = str;
        th = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }
}
