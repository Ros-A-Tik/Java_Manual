package GENERICS;

public class Java_HW_Test {

    public static String h = "Hello";
    public static String w = "World";
    public static String f = "Fuck!!!!";

    public static void showAll( String ho, String wo, String fu) {
        System.out.println(ho + " " + wo + " " + fu);
    }

    public static void main (String [] args) {
         showAll(h, w, f);
    }
}
