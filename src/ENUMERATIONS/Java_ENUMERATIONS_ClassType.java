package ENUMERATIONS;

public class Java_ENUMERATIONS_ClassType {

    public static void main (String[] args) {
        ApplePrice ap;

        System.out.println(ApplePrice.valueOf("Winesap") +  " price is: " + ApplePrice.Winesap.getPrice() + " cents.\n");

        System.out.println("All Apples Prices:");
        for(ApplePrice a : ApplePrice.values()) {
            System.out.println(a + " price " + a.getPrice() + " cents.");
        }
    }
}