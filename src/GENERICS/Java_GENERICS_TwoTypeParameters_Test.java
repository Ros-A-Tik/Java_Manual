package GENERICS;

public class Java_GENERICS_TwoTypeParameters_Test {

    public static void main (String[] args) {
        Java_GENERICS_TwoTypeParameters<Integer, String> t_gen_o;

        t_gen_o = new Java_GENERICS_TwoTypeParameters<Integer, String> (99, "Two generics parameters");
        t_gen_o.showTypes_T_V();
        System.out.println("The value of the \"Integer t_ob\" is: " + t_gen_o.getT_ob() + "\nThe value of the \"String v_ob\" is: " + t_gen_o.getV_ob());
    }
}
