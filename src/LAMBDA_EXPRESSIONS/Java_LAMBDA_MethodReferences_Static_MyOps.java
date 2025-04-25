package LAMBDA_EXPRESSIONS;

public class Java_LAMBDA_MethodReferences_Static_MyOps {

    public static String reverse (String str) {

        String  result = "";
        int i;
        for (i = str.length(); i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
