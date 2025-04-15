package GENERICS;

import java.io.*;

public class Java_GENERICS_OverridingMethods_Test {

    public static void main (String [] args) {

        Java_GENERICS_OverridingMethods <Integer> o_1 = new Java_GENERICS_OverridingMethods<>(88);
        Java_GENERICS_OverridingMethods_Overriding <Integer, Integer> o_2 = new Java_GENERICS_OverridingMethods_Overriding<>(99, 999);

        PrintWriter pw = new PrintWriter (System.out, true);
        pw.println(o_1.getOb());
        pw.println();
        pw.println(o_2.getOb());
        pw.println();
        pw.println(o_2.getOv());

    }
}
