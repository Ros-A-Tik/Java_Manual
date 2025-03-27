package GENERICS;

public class Java_GENERICS_SimpleExample<T> {

    T ob;

    Java_GENERICS_SimpleExample(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showTYpe() {
        System.out.println("Type og this \"T\" us: " + ob.getClass().getName());
    }
}
