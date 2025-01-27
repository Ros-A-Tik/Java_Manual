package EXCEPTION_HANDLING;

import java.util.Random;

public class Java_EXCEPTION_Try_Catch_For {
    public static void main(String[] args) {
        int a, b, c, d;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                a = r.nextInt();
                System.out.println("\"a\" is " + a);
                b = r.nextInt();
                System.out.println("\"b\" is " + b);
                c = 12345;
                System.out.println("\"c\" is " + c);
                d = c / (b / a);
                System.out.println("\"d\" is " + d);
            } catch (Exception e) {
                System.out.println(e + "\"a\" = \"0\". Division by \"0\" is error.");
            }
        }
    }
}
