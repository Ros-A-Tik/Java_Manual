package LAMBDA;

public class Java_LAMBDA_MethodReferences_Generic_Ops {
    static <T> int countMatching (T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
