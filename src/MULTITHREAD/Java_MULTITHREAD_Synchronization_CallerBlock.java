package MULTITHREAD;

public class Java_MULTITHREAD_Synchronization_CallerBlock implements Runnable {
    String msg;
    Java_MULTITHREAD_Synchronization_CallBlock target;
    Thread th;

    public Java_MULTITHREAD_Synchronization_CallerBlock(Java_MULTITHREAD_Synchronization_CallBlock targ, String str) {
        target = targ;
        msg = str;
        th = new Thread(this);
    }

    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}
