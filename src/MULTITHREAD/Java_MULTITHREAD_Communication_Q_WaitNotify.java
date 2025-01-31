package MULTITHREAD;

import java.sql.SQLOutput;

public class Java_MULTITHREAD_Communication_Q_WaitNotify {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
