package LAMBDA_EXPRESSIONS;

import java.io.*;

public class Java_LAMBDA_MethodReferences_StaticMethod_Test {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    static String strOp (Java_LAMBDA_MethodReferences<String> sf, String s) {
        return sf.func(s);
    }

    public static void main (String[] args) {

        String inStr = "Lambda add power to Java.";
        String outStr;

        outStr = strOp(Java_LAMBDA_MethodReferences_StaticMethod:: reverse_Static, inStr);

        pw.println("Original string is: " + inStr);
        pw.println("Reversed string is: " + outStr);

    }

}
