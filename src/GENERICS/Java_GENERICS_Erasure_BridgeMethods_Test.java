package GENERICS;

public class Java_GENERICS_Erasure_BridgeMethods_Test {

    public static void main (String [] args) {
        Java_GENERICS_Erasure_BridgeMethods_SubClass er = new Java_GENERICS_Erasure_BridgeMethods_SubClass("Generics test");

        System.out.println(er.getOb());
    }
    
}
