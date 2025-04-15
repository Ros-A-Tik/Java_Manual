package GENERICS;

import java.io.*;

public class Java_GENERICS_OverridingMethods <T> {

    PrintWriter pw = new PrintWriter (System.out, true);

    T ob;

    Java_GENERICS_OverridingMethods (T o) {
        ob = o;
    }

    T getOb() {
        pw.println("Gen's getOb() method: " + ob);
        return ob;
    }
}
