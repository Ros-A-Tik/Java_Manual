package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_PrintWriter {

    public static String str = "This is a string.";
    public static int i = -7;
    public static double d = 4.6e-7;

    public static void main (String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println(str);
        pw.println(i);
        pw.println(d);

    }
}
