package GENERICS;

import java.io.*;

public class Java_GENERICS_SubClass_Test {

    public static void main (String[] args) {
         Java_GENERICS_SubClass_generic <Integer> str = new Java_GENERICS_SubClass_generic<>(9090);

         PrintWriter pw = new PrintWriter(System.out, true);
         pw.println("Super \"ob\" is: " + str.num);
         pw.println("SubClass generic \"ob\" is: " + str.ob);

    }
}
