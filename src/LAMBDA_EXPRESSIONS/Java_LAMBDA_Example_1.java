package LAMBDA_EXPRESSIONS;

import java.io.*;

public class Java_LAMBDA_Example_1 {

public static void main (String [] args) {
    Java_LAMBDA_Example_MyNumber myNum;
    myNum = () -> 123.45;

    PrintWriter pw = new PrintWriter(System.out, true);
    pw.println("A fixed value: " + myNum.getValue());

    myNum = () -> Math.random() * 100;

    pw.println("A random value: " + myNum.getValue());
    pw.println("Another random value: " + myNum.getValue());
    pw.println("One more random value: " +  myNum.getValue());

}

}
