package INHERITANCE;

public class Java_INHERITANCE_Method_Overriding_B extends Java_INHERITANCE_Method_Overriding_A{
    int j;

    Java_INHERITANCE_Method_Overriding_B (int a, int b) {
        super(a);
        j = b;
    }
    void show() {
        super.show();
        System.out.println(i + ", " + j);
    }
}
