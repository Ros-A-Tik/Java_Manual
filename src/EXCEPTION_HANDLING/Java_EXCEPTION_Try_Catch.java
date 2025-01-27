package EXCEPTION_HANDLING;

import java.sql.SQLOutput;

public class Java_EXCEPTION_Try_Catch {

    public static void main(String[] args) {
        int a, b, c;
        b = 42;

        try {
            a = 2;
            c = b / a;
            System.out.println(b + " / " + a + " is " + c);

            a = 0;
            c = b / a;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e + ",\n \"42\" division by \"0\" is error.");
        }
    }
}