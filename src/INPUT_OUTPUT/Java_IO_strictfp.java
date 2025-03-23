package INPUT_OUTPUT;

public class Java_IO_strictfp {

    public static String strctfp = "With the creation of Java 2 several years ago, the floating-point computation model was\n" +
            "relaxed slightly. Specifically, the new model did not require the truncation of certain\n" +
            "intermediate values that occur during a computation. This prevented overflow or underflow\n" +
            "in some cases. By modifying a class, a method, or interface with strictfp, you could ensure\n" +
            "that floating-point calculations (and thus all truncations) took place precisely as they did\n" +
            "in earlier versions of Java. When a class was modified by strictfp, all the methods in the\n" +
            "class were also modified by strictfp automatically. However, beginning with JDK 17, all\n" +
            "floating-point computations are now strict, and strictfp is obsolete and no longer required.\n" +
            "Its use will now generate a warning message.\n" +
            "For versions of Java prior to JDK 17, the following example illustrates strictfp. It tells\n" +
            "Java to use the original floating-point model for calculations in all methods defined within\n" +
            "MyClass:\n" +
            "\nstrictfp class MyClass { //...\n" +
            "\nFrankly, most programmers never needed to use strictfp, because it affected only a very\n" +
            "small class of problems.\n" +
            "\nREMEMBER Beginning with JDK 17, stricfp has been rendered obsolete and its use will now generate a\n" +
            "warning message.";

    public static void main (String[] args) {
        System.out.println(strctfp);
    }
}
