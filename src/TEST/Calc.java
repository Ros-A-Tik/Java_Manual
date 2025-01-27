 package TEST;

import java.util.Scanner;

public class Calc {
    public static String str, action;
    public static int a, b, result;

    public static String calc (String input) {
        str = input;
        a = Character.getNumericValue(str.charAt(0));
        b = Character.getNumericValue(str.charAt(2));
        action = String.valueOf(str.charAt(1));

        if (a > 0 & a < 11 & b > 0 & b < 11) {
            switch (action) {
                case "+":
                    result = a + b;
                    System.out.println(result);
                    break;

                case "-":
                    result = a - b;
                    System.out.println(result);
                    break;

                case "*":
                    result = a * b;
                    System.out.println(result);
                    break;

                case "/":
                    result = a / b;
                    System.out.println(result);
                    break;
            }
        } else {
            System.out.println("Error! You input a wrong numbers format. Program is finished");
        }

        return input;
    }

    public static void main (String[] args) {

        System.out.println("Enter numbers between 1 - 10 and math action as follows \"1+10\", please.");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        if(str.length() == 3) {
                calc(str);
        } else {
            System.out.println("Error!");
        }
    }
}