package SWITCH;

import java.util.Scanner;

public class Java_SWITCH_ArrowBlock {

    static Scanner input = new Scanner(System.in);

    static int level;
    static int code;

    static boolean stop;

    static String str;


    public static String arrowBloc() {
        System.out.println("Input all what you want, please>");
        Scanner inp = new Scanner(System.in);
        str = inp.nextLine();
        return str;
    }

    public static void main (String [] args) {

        System.out.println("Input a number");
        code = input.nextInt();

        level = switch (code) {

                case 1000, 2010, 1890 -> {
                    stop = false;
                    System.out.println("Alert");
                    yield 1;
                }

                case 2000, 6010, 9128 -> {
                    stop = false;
                    System.out.println("Warning");
                    yield 2;
                }

                case 3000, 7023, 9300 -> {
                    stop = true;
                    System.out.println("Danger");
                    yield 3;
                }

                default -> {
                    stop = false;
                    System.out.println("Normal");
                    arrowBloc();
                    System.out.println(str);
                    yield 0;
                }
        };

        System.out.println("Priority level for code: " + code + " is " + level);

        if (stop) {
            System.out.println("\"STOP\" is required!!!");
        } else {
            System.out.println("You can work liber.");
        }

    }

}