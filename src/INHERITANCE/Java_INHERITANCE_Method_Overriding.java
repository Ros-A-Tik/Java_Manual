package INHERITANCE;

public class Java_INHERITANCE_Method_Overriding {

    public static void main (String [] args) {
        Java_INHERITANCE_Method_Overriding_A a = new Java_INHERITANCE_Method_Overriding_A(1);
        a.show();
        System.out.println();

        Java_INHERITANCE_Method_Overriding_B b = new Java_INHERITANCE_Method_Overriding_B(1, 2);
        b.show();
        System.out.println();

        Java_INHERITANCE_Method_Overriding_C c = new Java_INHERITANCE_Method_Overriding_C(1, 2, 3);
        c.show();
    }

}
