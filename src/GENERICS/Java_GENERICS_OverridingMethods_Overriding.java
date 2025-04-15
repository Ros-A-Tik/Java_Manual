package GENERICS;

import java.io.PrintWriter;

public class Java_GENERICS_OverridingMethods_Overriding<T, V> extends Java_GENERICS_OverridingMethods <T> {

    PrintWriter pw = new PrintWriter (System.out, true);

    T ob;
    V ov;

    Java_GENERICS_OverridingMethods_Overriding(T o, V v) {
        super (o);
        ob = o;
        ov = v;
    }

    T getOb() {
        pw.print("Overriding getOb() method: " + ob);

        return ob;
    }

    V getOv() {
        pw.print("Overriding getOb() method: " + ov);
        return  ov;
    }
}
