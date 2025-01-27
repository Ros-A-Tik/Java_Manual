package INTERFACES;

public class Java_INTERFACES_GeneralForm {

    public static void interfaceGeneralForm() {
        System.out.println("General form of Interfaces is:\naccess interface name {\n" +
                "\treturn-type method-name1(parameter-list);\n" +
                "\treturn-type method-name2(parameter-list);\n" +
                "\n\ttype final-varname1 = value;\n" +
                "\ttype final-varname2 = value;\n" +
                "\n\t//...\n" +
                "\n\treturn-type method-nameN(parameter-list);\n" +
                "\ttype final-varnameN = value;\n" +
                "}");
    }

    public static void interfaceImplementing() {
        System.out.println("\nInterface implementing formula is:" +
                "\nclass classname [extends superclass] [implements interface [,interface...]] {\n" +
                "\t// class-body\n" +
                "}");
    }

    public static void main (String [] args) {

        interfaceGeneralForm();
        interfaceImplementing();

    }
}
