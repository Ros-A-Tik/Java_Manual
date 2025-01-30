package MULTITHREAD;

public class Java_MULTITHREAD_Synchronized_NotifyAll extends Java_MULTITHREAD_Synchronized_Notify {
    public static String notifyAllMethod = "\"final void notify All( )\" (notifyAll()) method:" +
            "\n\t- wakes up all the threads that called wait( ) on the same object. One of the threads will be granted access.";

    public static void main (String[] args) {
        System.out.println(waitMethod);
        System.out.println();
        System.out.println(notifyMethod);
        System.out.println();
        System.out.println(notifyAllMethod);
    }
}
