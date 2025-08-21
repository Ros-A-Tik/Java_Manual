package SWITCH;

import java.util.Scanner;

public class Java_SWITCH_Arrow {

    static Scanner input = new Scanner(System.in);
    static int level;
    static int code;

    public static void main (String [] args) {

        System.out.println("Input a number");
        code = input.nextInt();

        level = switch (code) {

                case 1000, 2010, 1890 -> 1;

                case 2000, 6010, 9128 -> 2;

                case 3000, 7023, 9300 -> 3;

                default -> 0;
        };

        System.out.println("Priority level for code: " + code + " is " + level);

    }

}
