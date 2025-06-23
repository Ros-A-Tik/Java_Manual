package LAMBDA;

import java.util.*;

public class Java_LAMBDA_JavaUtilFunction {

    public static void main(String[] args) {

        //List of the java.util.function predefined interfaces
        String predefinedInterfaces = "The \"java.util.function\" package has the following predefined interfaces: ";
        String unaryOperator = "UnaryOperator <T>";
        String binaryOperator = "BinaryOperator <T>";
        String consumer = "Consumer <T>";
        String supplier = "Supplier <T>";
        String function = "Function <T, R>";
        String predicate = "Predicate <T>";

        //definitions of the predefined interfaces from the java.util.function package
        String unaryOperator_Definition = "Apply a unary operation to an object of type T and return the result, which i also of type T. It's method is called \"apply()\".";
        String binaryOperator_Definition = "Apply an operation to two objects of type T and return the result, which is also of type T. It's method is called \"apply()\".";
        String consumer_Definition = "Apply an operation on an object of type T. It's method is called \"accept()\".";
        String supplier_Definition = "Return an object of type T. It's method is called \"get()\".";
        String function_Definition = "Apply an operation to an object of type T and return the result as an object of type R. It's method is called \"apply()\".";
        String predicate_Definition = "Determine if an object of type T fulfills some constraint, Return a boolean value that indicates the outcome. It's method is called \"test()\".";

        //Creating a HashMap of the Predefined Interfaces from the java.util.function package
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put(unaryOperator, unaryOperator_Definition);
        hm.put(binaryOperator, binaryOperator_Definition);
        hm.put(consumer, consumer_Definition);
        hm.put(supplier, supplier_Definition);
        hm.put(function, function_Definition);
        hm.put(predicate, predicate_Definition);

        System.out.println(predefinedInterfaces);
        for (String i : hm.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Input a name of the predefined interface for print of his definition or 0 for exit.");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input) {
            case "UnaryOperator <T>":
                System.out.println(hm.get(unaryOperator));
                break;
            case "BinaryOperator <T>":
                System.out.println(hm.get(binaryOperator));
                break;
            case "Consumer <T>":
                System.out.println(hm.get(consumer));
                break;
            case "Supplier <T>":
                System.out.println(hm.get(supplier));
                break;
            case "Function <T, R>":
                System.out.println(hm.get(function));
                break;
            case "Predicate <T>":
                System.out.println(hm.get(predicate));
                break;
            case "0":
                System.exit(0);
        }

    }

}