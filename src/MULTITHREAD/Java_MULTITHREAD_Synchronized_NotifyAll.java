package MULTITHREAD;

public class Java_MULTITHREAD_Synchronized_NotifyAll extends Java_MULTITHREAD_Synchronized_Notify implements Runnable {

    public static String notifyAllMethod = "\"final void notify All( )\" (notifyAll()) method:" +
            "\n\t- wakes up all the threads that called wait( ) on the same object. One of the threads will be granted access.";

    public static Thread th;
    public static String msg;

    Java_MULTITHREAD_Synchronized_NotifyAll(String msge) {
        msg = msge;
        th = new Thread(this, msg);
    }

    public void run() {
        try {
            System.out.println(msg);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void main (String[] args) {
        Java_MULTITHREAD_Synchronized_NotifyAll st;
        st = new Java_MULTITHREAD_Synchronized_NotifyAll(waitMethod);
        st.th.start();
        st = new Java_MULTITHREAD_Synchronized_NotifyAll(notifyMethod);
        st.th.start();
        st = new Java_MULTITHREAD_Synchronized_NotifyAll(notifyAllMethod);
        st.th.start();
    }
}
