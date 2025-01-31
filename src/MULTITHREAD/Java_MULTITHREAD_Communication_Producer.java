package MULTITHREAD;

public class Java_MULTITHREAD_Communication_Producer implements Runnable {

    Java_MULTITHREAD_Communication_Q q;
    Thread th;

    Java_MULTITHREAD_Communication_Producer (Java_MULTITHREAD_Communication_Q q) {
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