package MULTITHREAD;

public class Java_MULTITHREAD_Communication_Consumer_WaitNotify implements Runnable {

    Java_MULTITHREAD_Communication_Q_WaitNotify q;
    Thread th;

    Java_MULTITHREAD_Communication_Consumer_WaitNotify(Java_MULTITHREAD_Communication_Q_WaitNotify q) {
        this.q = q;
        th = new Thread(this, "Consumer");
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}
