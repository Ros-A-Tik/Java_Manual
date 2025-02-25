package AUTOBOXING;

public class Java_AUTOBOXING_HelpsPreventErrors {

    public static void main (String[] args) {
        Integer i = 1000;
        int i_1 = i.byteValue();

        System.out.println(i); //is displayed
        System.out.println(i_1); // does not display 1000
    }
}
