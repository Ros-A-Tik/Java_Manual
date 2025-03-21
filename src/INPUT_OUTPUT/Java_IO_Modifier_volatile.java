package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_Modifier_volatile {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static String volat = "The volatile modifier tells the compiler that the variable modified by volatile can be\n" +
            "changed unexpectedly by other parts of your program. One of these situations involves\n" +
            "multithreaded programs. In a multithreaded program, sometimes two or more threads share\n" +
            "the same variable. For efficiency considerations, each thread can keep its own, private copy of\n" +
            "such a shared variable. The real (or master) copy of the variable is updated at various times,\n" +
            "such as when a synchronized method is entered. While this approach works fine, it may be\n" +
            "inefficient at times. In some cases, all that really matters is that the master copy of a variable\n" +
            "always reflects its current state. To ensure this, simply specify the variable as volatile, which\n" +
            "tells the compiler that it must always use the master copy of a volatile variable (or, at least,\n" +
            "always keep any private copies up-to-date with the master copy, and vice versa). Also, accesses\n" +
            "to the shared variable must be executed in the precise order indicated by the program.";

    public static void main(String[] args) {
        pw.println(volat);
    }
}
