package GENERICS;

public class Java_GENERICS_Erasure_BridgeMethods_SubClass extends Java_GENERICS_Erasure_BridgeMethods <String> {

    Java_GENERICS_Erasure_BridgeMethods_SubClass (String o) {
        super(o);
    }

    String getOb() {
        System.out.print("You called String getOb(): ");
        return ob;
    }

}
