package AUTOBOXING;

public class Java_AUTOBOXING_Expressions {
    public static void main(String[] args) {
        Integer i_1, i_2;
        int i;

        i_1 = 100;
        System.out.println("Original value of Integer i_1: " + i_1);

        ++i_1;
        System.out.println("Value of Integer i_1 after ++i_1 expression: " + i_1);

        i_2 = i_1 + (i_1/3);
        System.out.println("Value of Integer i_2 after i_1+(i_1/3) expression: " + i_2);

        i = i_1 + (i_1 / 3);
        System.out.println("Value on int i after i_1+(i_1/3) expression: " + i);

        Double d_1 = 98.5;
        System.out.println("The original value of d_1: " + d_1);
        d_1 = d_1 + i_1;
        System.out.println("The value of d_1 after d_1 + i_1 expression: " + d_1);

        i_1 = 2;
        switch(i_1) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error!");
        }

    }
}
