package GENERICS;

public class Java_GENERICS_Method_Search {

    public static <T extends Comparable<T>, V extends T> boolean isInside (T x, V[] y) {

        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

}
