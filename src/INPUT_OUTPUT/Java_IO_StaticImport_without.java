package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_StaticImport_without {

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static String staticImport = "\tJava includes a feature called static import that expands the capabilities of the import\n" +
            "\tkeyword. By following import with the keyword static, an import statement can be used to\n" +
            "\timport the static members of a class or interface. When using static import, it is possible\n" +
            "\tto refer to static members directly by their names, without having to qualify them with the\n" +
            "\tname of their class. This simplifies and shortens the syntax required to use a static member.";

    public static double side_1, side_2;
    public static double hypot;

    public static double hypotenuse (double sid_1, double sid_2) {

        side_1 = sid_1;
        side_2 = sid_2;

        hypot = Math.sqrt(Math.pow(side_1, 2) + Math.pow(side_2, 2));
        pw.println("The hypotenuse of triangle with sides length " + side_1 + " and " + side_2 + " is: " + hypot);
        return hypot;

    }

    public static void main(String[] args) {

        pw.println(staticImport);

        pw.println();

        hypotenuse(3.0, 4.0);

    }

}