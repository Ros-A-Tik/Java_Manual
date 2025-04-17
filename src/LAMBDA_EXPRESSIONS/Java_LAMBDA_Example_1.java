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
    pw.println("One more random value: " + myNum.getValue());


    Java_LAMBDA_Example_NumericTest numTest;
    numTest = (n) -> (n % 2) == 0;

    if (numTest.test(9)) {
        pw.println("9 in not even");
    }

    if (numTest.test(10)) {
        pw.println("10 in even.");
    }

    Java_LAMBDA_Example_NumericTest numNonNeg;
    numNonNeg = (n) -> n >= 0;
    if (numNonNeg.test(1)) {
        pw.println("1 is non negative.");
    }

    if (numNonNeg.test(-1)) {
        pw.println("-1 id negative");
    }
}

}
