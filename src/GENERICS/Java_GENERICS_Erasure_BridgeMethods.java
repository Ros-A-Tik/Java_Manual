package GENERICS;

public class Java_GENERICS_Erasure_BridgeMethods <T> {

    T ob;

    Java_GENERICS_Erasure_BridgeMethods (T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

}
