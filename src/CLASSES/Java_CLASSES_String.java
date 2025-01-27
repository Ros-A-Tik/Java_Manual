package CLASSES;

public class Java_CLASSES_String {

    public static void main(String[] args) {
        String str_1, str_2, str_3;

        str_1 = "First string";
        str_2 = "Second string";
        str_3 = str_1 + " and " + str_2;

        System.out.println(str_1);
        System.out.println("The str_1 length is: " + str_1.length());
        System.out.println("The char at index 1 of str_1 is: " + str_1.charAt(0));
        System.out.println();
        System.out.println(str_2);
        System.out.println("The str_2 length is: " + str_2.length());
        System.out.println("The char at index 2 of str_2 is: " + str_2.charAt(1));
        System.out.println();
        System.out.println(str_3);
        System.out.println("The str_3 length is: " + str_3.length());
        System.out.println("The char at index 3 of str_3 is: " + str_3.charAt(2));

        System.out.println();

        char r = 'r';
        for (int i = 0; i < str_1.length(); i++) {
            if (str_1.charAt(i) == r) {
                System.out.println("The str_1 contains letter \"r\".");
                break;
            }
        }

        for (int i = 0; i < str_2.length(); i++) {
            if (str_2.charAt(i) == r) {
                System.out.println("The str_2 contains letter \"r\".");
                break;
            }
        }

        for (int i = 0; i < str_3.length(); i++) {
            if (str_3.charAt(i) == r) {
                System.out.println("The str_3 contains letter \"r\".");
                break;
            }
        }

        System.out.println();

        if (str_1.equals(str_2)) {
            System.out.println("str_1 == str_2");
        } else {
            System.out.println("str_1 != str_2");
            if (str_2.equals(str_3)) {
                System.out.println("str_2 == str_3");
                System.out.println("str_3 != str_1");
            } else {
                System.out.println("str_2 != str_3");
                if (str_3.equals(str_1)) {
                    System.out.println("str_3 == str_1");
                } else {
                    System.out.println("str_3 != str_1");
                }
            }
        }

        System.out.println();

        String[] strArray = {"one", "two", "three"};
        System.out.println("The String Array \"strArray\" contains: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();

        if (str_3.contains(str_1)) {
            System.out.println("The str_3 contain str_1");
        } else {
            System.out.println("The str_3 not contain str_1");
        }
    }
}
