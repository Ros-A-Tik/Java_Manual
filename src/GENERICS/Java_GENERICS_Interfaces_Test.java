package GENERICS;

import java.io.*;

public class Java_GENERICS_Interfaces_Test {

    public static Integer [] intValues = {3, 6, 2, 8, 9};
    public static Character [] charValues = {'a', 'b', 'c', 'z', 'y', 'w'};

    public static void main (String [] args) {

        Java_GENERICS_Interfaces <Integer> intOb = new Java_GENERICS_Interfaces<>(intValues);
        Java_GENERICS_Interfaces <Character> charOb = new Java_GENERICS_Interfaces<>(charValues);

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("The minimum value of the array \"intValues\" is: " + intOb.min());
        pw.println("The maximum value of the array \"intValues\" is: " + intOb.max());

        pw.println();

        pw.println("The minimum value of the array \"charValues\" is: " + charOb.min());
        pw.println("The maximum value of the array \"charValues\" is: " + charOb.max());

    }

}
