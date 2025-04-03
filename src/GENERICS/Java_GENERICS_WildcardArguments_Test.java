package GENERICS;

public class Java_GENERICS_WildcardArguments_Test {

    public static void main (String[] args) {
        Integer [] i_nums = {1, 2, 3, 4, 5};
        Double [] d_nums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Float [] f_nums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};

        Java_GENERICS_WildcardArguments <Integer> i_ob = new Java_GENERICS_WildcardArguments<Integer>(i_nums);
        Java_GENERICS_WildcardArguments <Double> d_ob = new Java_GENERICS_WildcardArguments<Double>(d_nums);
        Java_GENERICS_WildcardArguments <Float> f_ob = new Java_GENERICS_WildcardArguments<Float>(f_nums);

        double i_average = i_ob.avarage();
        double d_average = d_ob.avarage();
        double f_average = f_ob.avarage();

        System.out.println("Integer average is: " + i_average);
        System.out. println("Double average is: " + d_average);
        System.out.println("Float average is " + f_average);

        System.out.println();
        System.out.println("Compare Integer, Double and Float objects by \"sameAverage method\".");
        System.out.println();

        if(i_ob.sameAverage(i_ob)) {
            System.out.println(i_ob.getClass().getName() + " are the same like " + i_ob.getClass().getName());
        } else {
            System.out.println(i_ob.getClass().getName() + " differ than " + i_ob.getClass().getName());
        }

        System.out.println();
        if(i_ob.sameAverage(d_ob)) {
            System.out.println(i_ob.getClass().getName() + " are the same like " + d_ob.getClass().getName());
        } else {
            System.out.println(i_ob.getClass().getName() + " differ than " + d_ob.getClass().getName());
        }

        System.out.println();
        if(i_ob.sameAverage(f_ob)) {
            System.out.println(i_ob.getClass().getName() + " are the same like " + f_ob.getClass().getName());
        } else {
            System.out.println(i_ob.getClass().getName() + " differ than " + f_ob.getClass().getName());
        }
    }
}