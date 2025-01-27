package EXCEPTION_HANDLING;

import java.sql.SQLOutput;

public class Java_EXCEPTION_GeneralForm {

    public static String tryCatchDeneralForm = "try {" +
            "\n\t//bloc of code to monitor for errors" +
            "\n} catch (ExceptionType1 exOb) {" +
            "\n\t//exception handler for ExceptionType1" +
            "\n} catch (ExceptionType2 exOb) {" +
            "\n\t//exception handler for ExceptionType1" +
            "\nfinally {" +
            "\n\t//block of code to be executed after try block ends" +
            "\n}";

    public static String exceptionKeyWords = "\nJava exception handling is managed via five keywords:" +
            "\n\t1)\ttry,\n\t2)\tcatch,\n\t3)\tthrow,\n\t4)\tthrows, \n\t5)\tfinally.";

    public static String throwGeneralForm = "throw ThrowableInstance";

    public static String throwsGeneralForm = "type method-name(parameter-list) throws exception-list {" +
            "\n\t// body of method" +
            "\n}";

    public static void main (String[] args) {
        System.out.println(exceptionKeyWords);
        System.out.println();
        System.out.println("The \"try-catch\" general form is:");
        System.out.println(tryCatchDeneralForm);
        System.out.println();
        System.out.println("The \"throw\" general form is:");
        System.out.println(throwGeneralForm);
        System.out.println();
        System.out.println("The \"throws\" general form is:");
        System.out.println(throwsGeneralForm);
    }
}

