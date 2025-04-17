package LAMBDA_EXPRESSIONS;

public class Java_LAMBDA_BlockBody_Test {

    public static void main (String[] args) {

        Java_LAMBDA_BlockBody <Double> blockBody;
        blockBody = (n) -> {

            double result = 1;

            for (double i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println("The factorial of the 3 is: " + blockBody.func(3.0));
        System.out.println("The factorial of the 5 is: " + blockBody.func(5.0));

    }

}
