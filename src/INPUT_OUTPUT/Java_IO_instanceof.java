package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_instanceof {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static Java_IO_instanceof_A cA = new Java_IO_instanceof_A();
    public static Java_IO_instanceof_B cB = new Java_IO_instanceof_B();
    public static Java_IO_instanceof_C cC = new Java_IO_instanceof_C();
    public static Java_IO_instanceof_D cD = new Java_IO_instanceof_D();

    public static void main(String[] args) {

        //instanceof cA object in class A and C
        if (cA instanceof Java_IO_instanceof_A) {
            pw.println("The \"cA\" object is instance of the \"Java_IO_instanceof_A\" class.");
        } else {
            pw.println("The \"cA\" object is not instance of the \"Java_IO_instanceof_A\" class.");
        }

        if (cA instanceof Java_IO_instanceof_C) {
            pw.println("The \"cA\" object is instance of the \"Java_IO_instanceof_C\" class.");
        } else {
            pw.println("The \"cA\" object is not instance of the \"Java_IO_instanceof_C\" class.");
        }

        //instanceof cB object in class B and D
        if (cB instanceof Java_IO_instanceof_B) {
            pw.println("The \"cB\" object is instance of the \"Java_IO_instanceof_B\" class.");
        } else {
            pw.println("The \"cB\" object is not instance of the \"Java_IO_instanceof_B\" class.");
        }

        if (cB instanceof Java_IO_instanceof_D) {
            pw.println("The \"cB\" object is instance of the \"Java_IO_instanceof_D\" class.");
        } else {
            pw.println("The \"cB\" object is not instance of the \"Java_IO_instanceof_D\" class.");
        }

        //instanceof cC object in class C and A
        if (cC instanceof Java_IO_instanceof_C) {
            pw.println("The \"cC\" object is instance of the \"Java_IO_instanceof_C\" class.");
        } else {
            pw.println("The \"cC\" object is not instance of the \"Java_IO_instanceof_C\" class.");
        }

        if (cC instanceof Java_IO_instanceof_A) {
            pw.println("The \"cC\" object is instance of the \"Java_IO_instanceof_A\" class.");
        } else {
            pw.println("The \"cC\" object is not instance of the \"Java_IO_instanceof_A\" class.");
        }

        //instanceof cD object in class D and B
        if(cD instanceof Java_IO_instanceof_D) {
            pw.println("The \"cD\" object is instance of the \"Java_IO_instanceof_D\" class.");
        } else {
            pw.println("The \"cD\" object is not instance of the \"Java_IO_instanceof_D\" class.");
        }

        if(cD instanceof Java_IO_instanceof_B) {
            pw.println("The \"cD\" object is instance of the \"Java_IO_instanceof_B\" class.");
        } else {
            pw.println("The \"cD\" object is not instance of the \"Java_IO_instanceof_B\" class.");
        }
    }
}
