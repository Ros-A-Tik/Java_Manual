package INTERFACES;

public class Java_INTERFACES_Applying_DynStack_Test {

    public static void main (String[] args) {

        Java_INTERFACES_Applying_DynStack mstck_3 = new Java_INTERFACES_Applying_DynStack(5);
        Java_INTERFACES_Applying_DynStack mstck_4 = new Java_INTERFACES_Applying_DynStack(8);

        for(int i = 0; i < 12; i++) {
            mstck_3.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mstck_4.push(i);
        }

        System.out.println("Stack in \"mstck_3\" is: ");
        for ( int i = 0; i < 12; i++) {
            System.out.println(mstck_3.pop());
        }

        for(int i = 0; i < 20; i++) {
            System.out.println(mstck_4.pop());
        }
    }
}
