package INTERFACES;

public class Java_INTERFACES_Nested_Test {

    public static void main (String[] args) {

        Java_INTERFACES_Nested_A.NestedIF nif = new Java_INTERFACES_Nested_B();

        if (nif.isNotNegative(10)) {
            System.out.println(" 10 is not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Not be displayed.");
        }
    }
}
