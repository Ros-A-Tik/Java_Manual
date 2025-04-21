package LAMBDA_EXPRESSIONS;

import java.io.*;

public class Java_LAMBDA_asArguments_Test {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static String strOp (Java_LAMBDA_asArguments<String> sf, String s) {
        return sf.argument(s);
    }

    public static void main (String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        pw.println("Here is an input string \"inStr\": " + inStr);

        outStr = (strOp((str) -> {
            String result = "";
            int i;
            for(i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr));

        pw.println("The string with spaces removed: " + outStr);

        Java_LAMBDA_asArguments <String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        pw.println("The reverse of the string \"inStr\" is: " + strOp(reverse, inStr));

    }
}
