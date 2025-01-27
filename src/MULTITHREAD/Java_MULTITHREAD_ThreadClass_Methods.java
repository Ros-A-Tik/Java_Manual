package MULTITHREAD;

public class Java_MULTITHREAD_ThreadClass_Methods {
    public static String threadClassMethods = "Te \"Thread Class\" methods are:";
    public static String getName = "\n\"getName\":" +
            "\n\t-\tObtain a thread's name.";
    public static String getPriority = "\n\"getPriority\":" +
            "\n\t-\tObtain a thread's priority.";
    public static String isAlive = "\n\"isAlive\":" +
            "\n\t-\tDetermine if a thread is still running.";
    public static String join = "\n\"join\":" +
            "\n\t-\tWait for a thread to terminate.";
    public static String run = "\n\"run\":" +
            "\n\t-\tEntry point for the thread.";
    public static String sleep = "\n\"sleep\":" +
            "\n\t-\tSuspend a thread for a period of time.";
    public static String start = "\n\"start\":" +
            "\n\t-\tStart a thread by calling it's run method.";

    public static void main (String[] args) {
        System.out.println(threadClassMethods);
        System.out.println(getName + getPriority + isAlive + join + run + sleep + start);
    }
}
