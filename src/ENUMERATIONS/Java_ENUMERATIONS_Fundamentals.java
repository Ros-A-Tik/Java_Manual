package ENUMERATIONS;

public class Java_ENUMERATIONS_Fundamentals {

    public static enum Apple {
        Jonatan, GoldenDen, RedDel, Winesap, Cortland
    }

    public static void main(String[] args) {

        Apple ap = Apple.RedDel;

        System.out.println("Value of the enum is: " + ap);
        System.out.println();

        ap = Apple.GoldenDen;
        if(ap == Apple.GoldenDen) {
            System.out.println("The \"ap\" continence: " + ap);
        }
        System.out.println();
        switch(ap) {
            case Jonatan:
                System.out.println(ap + " is Red.");
                break;
            case GoldenDen:
                System.out.println(ap + " is Yellow.");
                break;
            case RedDel:
                System.out.println(ap + " is Red.");
                break;
            case Winesap:
                System.out.println(ap + " is Red");
                break;
            case Cortland:
                System.out.println(ap + " is Red.");
                break;
        }
    }
}
