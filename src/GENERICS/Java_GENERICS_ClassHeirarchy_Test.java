package GENERICS;

import java.io.*;

public class Java_GENERICS_ClassHeirarchy_Test {

    public static void main (String [] args) {
        Java_GENERICS_ClassHeirarchy_Subclass <Integer> x = new Java_GENERICS_ClassHeirarchy_Subclass<Integer>(999);

        PrintWriter pw = new PrintWriter (System.out, true);

        pw.println("The value of \"ob_Super\" is: " + x.ob_Supper);
        pw.println("The value of \"ob_Subclass\" is: " + x.ob_Subclass);

    }
}
