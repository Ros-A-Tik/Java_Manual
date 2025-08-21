package SWITCH;

import java.util.Scanner;

public class Java_SWITCH_Traditional {

    static Scanner input = new Scanner(System.in);
    static int level;
    static int code;

    public static void main (String [] args) {
        System.out.println("Input a number");
        code = input.nextInt();
        switch (code) {
            case 1000:
            case 1200:
            case 8900:
                level = 1;
                break;
            case 2000:
            case 6010:
            case 9128:
                level = 2;
                break;
            case 3000:
            case 7023:
            case 9300:
                level = 3;
                break;
            default:
                level = 0;
                break;
        }

        System.out.println("Priority level for code: " + code + " is " + level);

    }

}
