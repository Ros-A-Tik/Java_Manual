package MULTITHREAD;

public class Java_MULTITHREAD_Communication_Producer_WaitNotify implements Runnable {

    Java_MULTITHREAD_Communication_Q_WaitNotify q;
    Thread th;

    Java_MULTITHREAD_Communication_Producer_WaitNotify(Java_MULTITHREAD_Communication_Q_WaitNotify q) {
        this.q = q;
        th = new Thread(this, "Producer");
    }

    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}