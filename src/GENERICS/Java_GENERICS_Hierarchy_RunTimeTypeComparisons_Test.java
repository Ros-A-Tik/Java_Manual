package GENERICS;

import java.io.*;

public class Java_GENERICS_Hierarchy_RunTimeTypeComparisons_Test {

    public static void main (String [] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        Java_GENERICS_Hierarchy_RunTimeTypeComparisons <Integer> ob_1_int = new Java_GENERICS_Hierarchy_RunTimeTypeComparisons<>(88);
        Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass <Integer> ob_2_int = new Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass<>(99);
        Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass <String> ob_2_str = new Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass<>("Values are: ");

        if (ob_1_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons <?>) {
            pw.println("The \"ob_1_int\" is instance of (int): " + ob_1_int.getClass());
        }

        if (ob_1_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass <?>) {
            pw.println("The \"ob_1_int\" is instance of (int): " + ob_2_int.getClass());
        }

        if (ob_1_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass <?>) {
            pw.println("The \"ob_1_int\" is instance of (str): " + ob_2_str.getClass());
        }

        pw.println();

        if (ob_2_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons <?>) {
            pw.println("The \"ob_2_int\" is instance of (int): " + ob_1_int.getClass());
        }

        if (ob_2_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass<?>) {
            pw.println("The \"ob_2_int\" is instance of (int): " + ob_2_int.getClass());
        }

        if (ob_2_int instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass<?>) {
            pw.println("The \"ob_2_int\" is instance of (str): " + ob_2_str.getClass());
        }

        pw.println();

        if (ob_2_str instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons <?>) {
            pw.println("The \"ob_2_str\" is instance of (int): " + ob_1_int.getClass());
        }

        if (ob_2_str instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons_SubClass<?>) {
            pw.println("The \"ob_2_str\" is instance of (int): " + ob_2_int.getClass());
        }

        if (ob_2_str instanceof Java_GENERICS_Hierarchy_RunTimeTypeComparisons <?>) {
            pw.println("The \"ob_2_str\" is instance of (str): " + ob_2_str.getClass());
        }


    }
}
