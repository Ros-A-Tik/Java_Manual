package AUTOBOXING;

public class Java_AUTOBOXING_WordOfWarning {
    public static void main (String[] args) {
        Double a, b, c;

        a = 10.0;
        b = 4.0;

        c = Math.hypot(a, b);
        System.out.println(c);

        c = Math.sqrt(a * a + b * b);
        System.out.println(c);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);


        c = Math.sqrt(144);
        System.out.println(c);
    }
}
