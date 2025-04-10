package GENERICS;

public class Java_GENERICS_Constructors {

    private double val;

    <T extends Number> Java_GENERICS_Constructors (T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("The \"val\" is: " + val);
    }

}
