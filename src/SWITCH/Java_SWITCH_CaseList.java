package SWITCH;

import java.util.Scanner;

public class Java_SWITCH_CaseList {

    static Scanner input = new Scanner(System.in);
    static int level;
    static int code;

    public static void main (String [] args) {
        System.out.println("Input a number");
        code = input.nextInt();
        switch (code) {
            case 1000, 2010, 1890:
                level = 1;
                break;
            case 2000, 6010, 9128:
                level = 2;
                break;
            case 3000,  7023, 9300:
                level = 3;
                break;
            default:
                level = 0;
                break;
        }

        System.out.println("Priority level for code: " + code + " is " + level);

    }

}
