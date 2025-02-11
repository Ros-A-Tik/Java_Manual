package ENUMERATIONS;

public class Java_ENUMERATIONS_ValuesValueOff {

    public static void main (String[] args) {

        Apples aps;

        System.out.println("Here are all Apple Enumerations constants:");
        Apples[] allApples = Apples.values();
        for(Apples a : allApples) {
            System.out.println(a + ", ");
        }

        System.out.println();

        aps = Apples.valueOf("Winesap");
        System.out.println(aps);

    }
}