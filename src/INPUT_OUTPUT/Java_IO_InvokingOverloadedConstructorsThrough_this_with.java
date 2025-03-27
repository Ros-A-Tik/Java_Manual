package INPUT_OUTPUT;

public class Java_IO_InvokingOverloadedConstructorsThrough_this_with {

    int a, b;

    Java_IO_InvokingOverloadedConstructorsThrough_this_with(int i, int j) {
        a = i;
        b = j;
    }

    Java_IO_InvokingOverloadedConstructorsThrough_this_with(int i) {
        this (i, i);
    }

    Java_IO_InvokingOverloadedConstructorsThrough_this_with() {
        this (0);
    }

    public static void main (String[] args) {

        Java_IO_InvokingOverloadedConstructorsThrough_this_with o_1;

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_with();
        System.out.println("The value of \"int a\" and \"int b\" from constructor without parameters: " +  o_1.a + " and " + o_1.b);

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_with(1);
        System.out.println("The value of \"int a\" and \"int b\" from constructor with one parameter: " +  o_1.a + " and " + o_1.b);

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_with(2, 3);
        System.out.println("The value of \"int a\" and \"int b\" from constructor with two parameters: " +  o_1.a + " and " + o_1.b);

    }
}
