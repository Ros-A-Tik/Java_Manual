package INPUT_OUTPUT;

import static java.lang.Math.*;

public class Java_IO_StaticImport_with extends Java_IO_StaticImport_without {

    public static double staticImport (double sid_1, double sid_2) {
        side_1 = sid_1;
        side_2 = sid_2;

        hypot = sqrt(pow(side_1, 2) + pow(side_2, 2));
        pw.println("The hypotenuse of triangle with sides length " + side_1 + " and " + side_2 + " is: " + hypot);
        return hypot;
    }

    public static void main (String[] args) {

        pw.println(staticImport);
        pw.println();
        staticImport(5.2, 7.3);

    }
}
