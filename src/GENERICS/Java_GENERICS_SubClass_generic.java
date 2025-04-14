package GENERICS;

public class Java_GENERICS_SubClass_generic <T> extends Java_GENERICS_SubClass {
     T ob;

    Java_GENERICS_SubClass_generic (T o) {
        super ((Integer) o);
        ob = o;
     }

     T getOb() {
        return ob;
     }
}
