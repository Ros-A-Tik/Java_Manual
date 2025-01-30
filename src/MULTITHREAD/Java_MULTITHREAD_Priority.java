package MULTITHREAD;

public class Java_MULTITHREAD_Priority {

    public static String s_priority = "The thread priority can be set by \"final void setPriority(int level)\" method.";
    public static String g_priority = "The thread priority can be used by \"final int getPriority()\" method.";
    public static String s_priorityLevel = "The \"int level\" of the Priority can be set between 1 and 10," +
            "\nor it can be set by:" +
            "\n\t\"MIN_PRIORITY\" is equal to 1;" +
            "\n\t\"NORM_PRIORITY\" is equal to 5;" +
            "\n\t\"MAX_PRIORITY\" is equal to 10";

    public static void main (String [] args) {
        System.out.println(s_priority);
        System.out.println();
        System.out.println(s_priorityLevel);
        System.out.println();
        System.out.println(g_priority);
    }
}
