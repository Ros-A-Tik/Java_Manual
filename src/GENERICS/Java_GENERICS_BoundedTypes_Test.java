package GENERICS;

import java.io.*;

public class Java_GENERICS_BoundedTypes_Test {

    public static void main (String [] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        Integer [] inums = new Integer [7];
        for (int i = 0; i < inums.length; i++) {
            inums[i] = i;
        }
        Java_GENERICS_BoundedTypes<Integer> iob = new Java_GENERICS_BoundedTypes<Integer> (inums);
        pw.println(iob.avarage());


        Double [] dnums = new Double [7];
        for (int i = 0; i < dnums.length; i++) {
            for (double d = 1.5; d < dnums.length; d++) {
                dnums[i] = d;
                d += 0.76;
            }
        }
        Java_GENERICS_BoundedTypes <Double> dob = new Java_GENERICS_BoundedTypes<Double>(dnums);
        pw.println(dob.avarage());

    }

}
