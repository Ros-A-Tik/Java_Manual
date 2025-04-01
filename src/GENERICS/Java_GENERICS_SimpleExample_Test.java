package GENERICS;

public class Java_GENERICS_SimpleExample_Test {
    public static void main (String[] ars) {

        Java_GENERICS_SimpleExample<Integer> int_o;

        int_o = new Java_GENERICS_SimpleExample<Integer>(88);
        int_o.showTYpe();
        int v = int_o.getOb();
        System.out.println("The value of \"int v\" is: " + v);
        System.out.println();

        Java_GENERICS_SimpleExample<String> str_o;
        str_o = new Java_GENERICS_SimpleExample<String>("Generic Test");
        str_o.showTYpe();
        String str = str_o.getOb();
        System.out.println("The value of the \"String str\" is: " + str);
        System.out.println();

        Java_GENERICS_SimpleExample<Double> double_o;
        double_o = new Java_GENERICS_SimpleExample<Double>(88.44);
        double_o.showTYpe();
        System.out.println("The value of the \"String str\" is: " + double_o.getOb());
        System.out.println();
    }


}
