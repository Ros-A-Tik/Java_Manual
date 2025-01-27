package INHERITANCE;

public class Java_INHERITANCE_Method_Overriding_C extends Java_INHERITANCE_Method_Overriding_B {
    int k;
    Java_INHERITANCE_Method_Overriding_C (int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println(i + ", " + j + ", " + k);
    }
}
