package GENERICS;

public class Java_GENERICS_TwoTypeParameters<T, V> {
    T t_ob;
    V v_ob;

    Java_GENERICS_TwoTypeParameters(T t_o, V v_o) {
        t_ob = t_o;
        v_ob = v_o;
    }

    T getT_ob() {
        return t_ob;
    }

    V getV_ob() {
        return v_ob;
    }

    void showTypes_T_V() {
        System.out.println("The type of \"T t_ob\" is: " + t_ob.getClass().getName() +
                "\nThe type of \"V v_ob\" is: " + v_ob.getClass().getName());
    }
}
