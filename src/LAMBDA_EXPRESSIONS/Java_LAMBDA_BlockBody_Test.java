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

        System.out.println();

        Java_LAMBDA_BlockBody <String> str;
        str = (String n) -> {
            String result = "";

            for (int i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda reversed is: " + str.func("Lambda"));
        System.out.println("Expression reversed is: " + str.func("Expression"));

    }

}
