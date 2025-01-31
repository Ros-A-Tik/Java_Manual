package MULTITHREAD;

public class Java_MULTITHREAD_Communication_Q {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put (int n) {
        this.n = n;
        System.out.println("Put: " + n);
    }
}
