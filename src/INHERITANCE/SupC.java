package INHERITANCE;

class SupC {
    static int i, j;

    static void showIJ() {
        System.out.println("The \"i\" is: " + i +", \nThe \"j\" is: " + j);
    }
}

class SubC extends SupC {
    static int k;

     static void shwoK() {
        System.out.println("The \"k\" is: " + k);
    }

    static void sumIJK() {
        System.out.println("Sum of \"i\", \"j\" and \"k\" is: " + (i+j+k));
    }
}

class Inheritance_Test extends SubC {
    public static void main (String [] args) {

        System.out.println("Show SupC super class vars using SupC object.");
        SupC sup = new SupC();

        sup.i = 10;
        sup.j = 20;
//        sup.k = 30; //ERROR because K is not an SupC object;

        sup.showIJ();
//        sup.shwoK();
//        sup.sumIJK(); //ERROR because K is not an SupC object;

        System.out.println("Show SubC subclass and SupC superclass vars using SubC object and inheritance.");
        SubC sub = new SubC();
        sub.i = 20;
        sub.j = 30;
        sub.k = 40;

        sub.showIJ();
        sub.shwoK();
        sub.sumIJK();

        System.out.println("Show SupC superclass and SubC subclass using only inheritance by the Main Class.");
        i = 50;
        j = 60;
        k = 70;

        showIJ();
        shwoK();
        sumIJK();
    }

}
