package EXCEPTION_HANDLING;

import java.sql.SQLOutput;

public class Java_EXCEPTION_Throw {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println(e + ", " + "Caught inside demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
