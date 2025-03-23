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
            pw.println("The \"cA\" object is instance of the class: " + cA.getClass());
        } else {
            pw.println("The \"cA\" object is not instance of the class: " + cA.getClass() );
        }

        if (cA instanceof Java_IO_instanceof_C) {
            pw.println("The \"cA\" object is instance of the class: " + cC.getClass());
        } else {
            pw.println("The \"cA\" object is not instance of the class: " + cC.getClass());
        }

        //instanceof cB object in class B and D
        if (cB instanceof Java_IO_instanceof_B) {
            pw.println("The \"cB\" object is instance of the class: " + cB.getClass());
        } else {
            pw.println("The \"cB\" object is not instance of the class: " +cB.getClass());
        }

        if (cB instanceof Java_IO_instanceof_D) {
            pw.println("The \"cB\" object is instance of the class: " + cD.getClass());
        } else {
            pw.println("The \"cB\" object is not instance of the class: " + cD.getClass());
        }

        //instanceof cC object in class C and A
        if (cC instanceof Java_IO_instanceof_C) {
            pw.println("The \"cC\" object is instance of the class: " + cC.getClass());
        } else {
            pw.println("The \"cC\" object is not instance of the class: " + cC.getClass());
        }

        if (cC instanceof Java_IO_instanceof_A) {
            pw.println("The \"cC\" object is instance of the class: " + cA.getClass());
        } else {
            pw.println("The \"cC\" object is not instance of the class: " + cA.getClass());
        }

        //instanceof cD object in class D and B
        if(cD instanceof Java_IO_instanceof_D) {
            pw.println("The \"cD\" object is instance of the class: " + cD.getClass());
        } else {
            pw.println("The \"cD\" object is not instance of the class: " + cD.getClass());
        }

        if(cD instanceof Java_IO_instanceof_B) {
            pw.println("The \"cD\" object is instance of the class: " + cB.getClass());
        } else {
            pw.println("The \"cD\" object is not instance of the class: " + cB.getClass());
        }

        pw.println();

        //compare types of derived types
        Java_IO_instanceof_A ob;

        ob = cC;
        pw.println("The \"ob\" now refers to: " + ob.getClass());

        if (ob instanceof Java_IO_instanceof_C) {
            pw.println("The \"ob\" is instance of the class: " + ob.getClass());
        }

        pw.println();

        // all objects can be cast to Object
        if(cA instanceof Object)
            System.out.println(cA.getClass() + " may be cast to class Object");
        if(cB instanceof Object)
            System.out.println(cB.getClass() + " may be cast to class Object");
        if(cC instanceof Object)
            System.out.println(cC.getClass() + " may be cast to class Object");
        if(cD instanceof Object)
            System.out.println(cD.getClass() + " may be cast to class Object");

    }
}
