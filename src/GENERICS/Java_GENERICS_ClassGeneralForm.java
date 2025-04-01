package GENERICS;

import java.io.*;

public class Java_GENERICS_ClassGeneralForm {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static String genericsGeneralForm = "The generics syntax shown in the preceding examples can be generalized. Here is the syntax for declaring a generic class:\n" +
            "\n\tclass class-name<type-param-list > { // …\n" +
            "\nHere is the full syntax for declaring a reference to a generic class and instance creation:\n" +
            "\n\tclass-name<type-arg-list > var-name =\n" +
            "\t\tnew class-name<type-arg-list >(cons-arg-list);";

    public static void main(String[] args) {
        pw.println(genericsGeneralForm);
    }
}
