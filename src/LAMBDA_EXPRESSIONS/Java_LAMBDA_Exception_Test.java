package LAMBDA_EXPRESSIONS;

import java.io.*;

public class Java_LAMBDA_Exception_Test {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static void main(String [] args) throws Java_LAMBDA_Exception_Array {

        double[] values = {1.0, 2.0, 3.0, 4.0};

        Java_LAMBDA_Exceptions <Double> average = (n) -> {
            double sum = 0;

          if (n.length == 0) {
              throw new Java_LAMBDA_Exception_Array();
          }

          for (int i = 0; i <n.length; i++) {
              sum += n[i];
          }

          return sum / n.length;
        };

        pw. println("The average is: " + average.func(values));

        //This will be Excepted
        pw.println("The average is: " + average.func(new double[0]));

    }

}
