package LAMBDA_EXPRESSIONS;

public class Java_LAMBDA_MethodReferences_StaticMethod {

    public static String reverse_Static(String str) {

        String  result_Static = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result_Static += str.charAt(i);
        }
        return result_Static;
    }
}
