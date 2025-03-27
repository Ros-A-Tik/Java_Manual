package INPUT_OUTPUT;

public class Java_IO_InvokingOverloadedConstructorsThrough_this_without {

    int a, b;

    Java_IO_InvokingOverloadedConstructorsThrough_this_without(int i, int j) {
        a = i;
        b = j;
    }

    Java_IO_InvokingOverloadedConstructorsThrough_this_without (int i) {
        a = i;
        b = i;
    }

    Java_IO_InvokingOverloadedConstructorsThrough_this_without() {
        a = 0;
        b = 0;
    }

    public static void main (String[] args) {

        Java_IO_InvokingOverloadedConstructorsThrough_this_without o_1;

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_without();
        System.out.println("The value of \"int a\" and \"int b\" from constructor without parameters: " +  o_1.a + " and " + o_1.b);

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_without(1);
        System.out.println("The value of \"int a\" and \"int b\" from constructor with one parameter: " +  o_1.a + " and " + o_1.b);

        o_1 = new Java_IO_InvokingOverloadedConstructorsThrough_this_without(2, 3);
        System.out.println("The value of \"int a\" and \"int b\" from constructor with two parameters: " +  o_1.a + " and " + o_1.b);

    }
}
