package MULTITHREAD;

public class Java_MULTITHREAD_Communication_Consumer implements Runnable {

    Java_MULTITHREAD_Communication_Q q;
    Thread th;

    Java_MULTITHREAD_Communication_Consumer (Java_MULTITHREAD_Communication_Q q) {
        this.q = q;
        th = new Thread(this, "Consumer");
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}
