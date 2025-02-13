package ENUMERATIONS;

public class Java_ENUMERATIONS_OrdinalCompareToEquals {

    public static void main(String[] args) {

        Apples a_1, a_2, a_3;

        System.out.println("The list of the \"Apples\" Enumeration and his \"ordinal()\" values: ");
        for (Apples a : Apples.values()) {
            System.out.println(a + " " + a.ordinal());
        }


        System.out.println();
        System.out.println("Using \"compareTo()\" method to compare \"Apples\" Enumerations values: ");
        a_1 = Apples.RedDel;
        a_2 = Apples.GoldenDel;
        a_3 = Apples.RedDel;
        if(a_1.compareTo(a_2) < 0) {
            System.out.println(a_1 + " is before " + a_2);
        }
        if (a_1.compareTo(a_3) < 0) {
            System.out.println(a_1 + " is before " + a_3);
        }
        if (a_1.compareTo(a_2) > 0) {
            System.out.println(a_1 + " is after " + a_2);
        }
        if (a_1.compareTo(a_3) > 0) {
            System.out.println(a_1 + " is after " + a_3);
        }
        if (a_1.compareTo(a_2) == 0) {
            System.out.println(a_1 + " is equals to " + a_2);
        }
        if (a_1.compareTo(a_3) == 0) {
            System.out.println(a_1 + " is equals to " +  a_3);
        }

        System.out.println();
        System.out.println("Using \"equals()\" method to compare \"Apples\" Enumerations values: ");
        if(a_1.equals(a_2)) {
            System.out.println(a_1 + " equals to " + a_2);
        }
        if (a_1.equals(a_3)) {
            System.out.println(a_1 + " equals to " + a_3);
        }
        if (a_2.equals(a_3)) {
            System.out.println(a_2 + " equals to " + a_3);
        }

        System.out.println();
        System.out.println("Using \"==\" operator to compare \"Apples\" Enumerations values: ");
        if (a_1 == a_2) {
            System.out.println(a_1 + " == " + a_2);
        }
        if (a_1 == a_3) {
            System.out.println(a_1 + " == " + a_3);
        }
        if (a_2 == a_3) {
            System.out.println(a_2 + " == " +  a_3);
        }
    }
}