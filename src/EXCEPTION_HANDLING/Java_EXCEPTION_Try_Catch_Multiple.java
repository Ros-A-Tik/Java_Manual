package EXCEPTION_HANDLING;

public class Java_EXCEPTION_Try_Catch_Multiple {

    public static void main (String [] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;

            int [] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("the end!!!");
    }
}
