package INTERFACES;

public class Java_INTERFACES_Extened_Test {

    public static void main (String[] args) {

        System.out.println("Show Interfaces from \"MClass\".");
        Java_INTERFACES_Extended_MClass m = new Java_INTERFACES_Extended_MClass();
        m.math_1();
        m.math_2();
        m.math_3();

        System.out.println();
        System.out.println("Show Interfaces from \"NClass\".");
        Java_INTERFACES_Extended_NClass n = new Java_INTERFACES_Extended_NClass();
        n.math_1();
        m.math_2();

    }

}
