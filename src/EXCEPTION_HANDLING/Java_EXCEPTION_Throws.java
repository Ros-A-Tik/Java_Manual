package EXCEPTION_HANDLING;

public class Java_EXCEPTION_Throws {
    static void throeOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throeOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e);
        }
    }
}
