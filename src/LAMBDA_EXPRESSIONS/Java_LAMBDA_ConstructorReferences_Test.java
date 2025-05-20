package LAMBDA_EXPRESSIONS;

import java.io.PrintWriter;

public class Java_LAMBDA_ConstructorReferences_Test {

    public static void main (String [] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        Java_LAMBDA_ConstructorReferences<String> myClassConst = Java_LAMBDA_ConstructorReferences_MyClass<String>::new;
        Java_LAMBDA_ConstructorReferences_MyClass<String> mc = myClassConst.func("One hundred");
        pw.println("\"val\" in \"mc\" is: " + mc.getVal());

    }

}