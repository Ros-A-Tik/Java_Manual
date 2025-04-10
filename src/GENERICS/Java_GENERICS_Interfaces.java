package GENERICS;

public class Java_GENERICS_Interfaces <T extends Comparable <T>> implements Java_GENERICS_Interface <T> {

    T[] vals;

    Java_GENERICS_Interfaces (T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals [0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for ( int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }

}
