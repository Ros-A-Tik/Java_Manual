package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_Modifier_transient {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static String trans = "When an instance variable is declared as transient, its value need not persist when\n" +
            "an object is stored.For example:\n" +
            "class T {\n" +
            "\ttransient int a; // will not persist\n" +
            "\tint b; // will persist\n" +
            "}\n" +
            "Here, if an object of type T is written to a persistent storage area, the contents of a would not\n" +
            "be saved, but the contents of b would.";

    public static void main (String[] args) {

        pw.println(trans);

    }
}
