package GENERICS;

public class Java_GENERICS_Method_Search_Test {

    public static void main (String [] args) {

        Integer [] intValues = {1, 2, 3, 4, 5, 6};
        String [] strValues = {"one", "two", "three", "four", "five", "six"};
        Character [] charValues = {'1', '2', '3', '4', '5', '6', 'a'};

        Java_GENERICS_Method_Search jgm = new Java_GENERICS_Method_Search();

        //Verify values in inside the Array intValuers
        if (jgm.isInside(2, intValues)) {
            System.out.println("The number \"2\" is inside the Array \"intValues\".");
        }
        if (jgm.isInside(7, intValues)) {
            System.out.println("The number \"7\" is not in inside the Array \"intValues\".");
        }

        //Verify values in inside th Array strValues
        if (jgm.isInside("one", strValues)) {
            System.out.println("The string \"one\" is inside the Array \"strValues\".");
        }
        if (jgm.isInside("seven", strValues)) {
            System.out.println("The string \"seven\" in not inside the Array \"strValues\".");
        }

        //Verify values in inside charValues
        if (jgm.isInside('1', charValues)) {
            System.out.println("The character \'1\' is inside the Array \"charValues\".");
        }
        if (jgm.isInside('A', charValues)) {
            System.out.println("The character \'A\' is inside the Array \"charValues\".");
        }
        if (jgm.isInside('B', charValues)) {
            System.out.println("The character \'B\' is not inside the Array \"charValues\".");
        }
    }
}
