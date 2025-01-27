package EXCEPTION_HANDLING;

public class Java_EXCEPTION_MyPerosnal extends Exception {

    private int detail;

    Java_EXCEPTION_MyPerosnal(int a) {
        detail = a;
    }

    public String toString() {
        return "MeException [" + detail + "]";
    }
}

class Java_EXCEPTION_MyPersonal_Test {

    static void compute (int a) throws Java_EXCEPTION_MyPerosnal {
        System.out.println("Called compute(" + a + ")");
        if (a < 10) {
            throw new Java_EXCEPTION_MyPerosnal(a);
        }
        System.out.println("Normal exit");
    }
    public static void main (String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (Java_EXCEPTION_MyPerosnal e) {
            System.out.println("Caught: " + e);
        }
    }
}
