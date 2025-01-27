package INTERFACES;

public class Java_INTERFACES_Nested_B implements Java_INTERFACES_Nested_A.NestedIF {
    public boolean isNotNegative (int x) {
        return x < 0 ? false : true;
    }
}
