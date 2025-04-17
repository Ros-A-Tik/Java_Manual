package GENERICS;

public class Java_GENERICS_ClassHeirarchy_Subclass <T> extends Java_GENERICS_ClassHeirarchy_Supper <T> {

    T ob_Subclass;

    public Java_GENERICS_ClassHeirarchy_Subclass (T o) {
        super (o);
        ob_Subclass = o;
    }

    T getOb_Subclass() {
        return ob_Subclass;
    }

}
