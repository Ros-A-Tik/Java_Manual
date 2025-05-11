package LAMBDA_EXPRESSIONS;

import java.io.*;

public class Java_LAMBDA_MethodReferences_Generic_Test {
    public static PrintWriter pw = new PrintWriter(System.out, true);

    static <T> int myOp(Java_LAMBDA_MethodReferences_Generic<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main (String [] args) {

        Integer [] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String [] strs = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(Java_LAMBDA_MethodReferences_Generic_Ops :: <Integer> countMatching, vals, 4);
        pw.println("Integer array \"vals\" contains: " + count + " 4-s");

        count = myOp(Java_LAMBDA_MethodReferences_Generic_Ops :: <String> countMatching, strs, "Two");
        pw.println("String array \"strs\" contains: " + count + " Two-s");

    }

}
