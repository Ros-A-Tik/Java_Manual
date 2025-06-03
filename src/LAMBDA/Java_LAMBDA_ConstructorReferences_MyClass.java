package LAMBDA;

public class Java_LAMBDA_ConstructorReferences_MyClass <T> {

    private T val;

    Java_LAMBDA_ConstructorReferences_MyClass (T v) {
        val = v;
    }

    Java_LAMBDA_ConstructorReferences_MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
