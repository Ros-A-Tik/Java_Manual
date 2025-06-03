package LAMBDA;

public class Java_LAMBDA_MethodReferences_InstanceMethod {

    String reverse_Instance(String str) {

        String  result_Instance = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result_Instance += str.charAt(i);
        }
        return result_Instance;
    }
}
