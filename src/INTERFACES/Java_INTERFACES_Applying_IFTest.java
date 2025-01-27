package INTERFACES;

public class Java_INTERFACES_Applying_IFTest {

    public static void main (String [] args) {

        Java_INTERFACES_Applying_FixedStack mstck_1 = new Java_INTERFACES_Applying_FixedStack(5);
        Java_INTERFACES_Applying_FixedStack mstck_2 = new Java_INTERFACES_Applying_FixedStack(8);

        for (int i = 0; i < 5; i++) {
            mstck_1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mstck_2.push(i);
        }

        System.out.println("Stack in \"mstck_1\" is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" - " + mstck_1.pop());
        }

        System.out.println();
        System.out.println();

        System.out.println("Stack in my \"stack_2\" is: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(" - " + mstck_2.pop());
        }
    }
}
