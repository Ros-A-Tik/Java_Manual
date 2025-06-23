package LAMBDA;

import java.util.Scanner;
import java.util.function.Function;

public class Java_FunctionaInterface_Demo {

    public static void main (String [] args) {

        System.out.println("Input a number for calculating of his factorial, please.");
        Scanner scan = new Scanner (System.in);
        Integer input = scan.nextInt();

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("The factorial of the \"3\" is: " + factorial.apply(input));

    }

}
