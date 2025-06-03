package LAMBDA;

import java.util.*;

class MyClass {
    private int val;
    MyClass (int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

public class Java_LAMBDA_MethodReferences_UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main (String[] args) {
        ArrayList<MyClass> list = new ArrayList<MyClass>();

        for (int i = 0; i <= 9; i++) {
            list.add(new MyClass(i));
        }

        MyClass maxValOb = Collections.max(list, Java_LAMBDA_MethodReferences_UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + maxValOb.getVal());

    }

}