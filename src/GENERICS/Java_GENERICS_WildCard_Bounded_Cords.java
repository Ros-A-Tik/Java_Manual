package GENERICS;

public class Java_GENERICS_WildCard_Bounded_Cords<T extends Java_GENERICS_WildCard_Bounded_TwoD> {
    T [] coords;

    Java_GENERICS_WildCard_Bounded_Cords(T [] o) {
        coords = o;
    }

    public static void showXY(Java_GENERICS_WildCard_Bounded_Cords <?> c) {
        System.out.println("\"\" and \"Y\" coordinates are: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " and " + c.coords[i].y);
            System.out.println();
        }
    }

    public static void showXYZ(Java_GENERICS_WildCard_Bounded_Cords <? extends Java_GENERICS_WildCard_Bounded_ThreeD> c) {
        System.out.println("\"X\", \"Y\" and \"Z\" coordinates are>:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z);
            System.out.println();
        }
    }

    public static void showXYZT(Java_GENERICS_WildCard_Bounded_Cords <? extends Java_GENERICS_WildCard_Bounded_FourD> c) {
        System.out.println("\"X\", \"Y\", \"Z\" and \"T\" coordinates are>:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z + ", " + c.coords[i].t);
            System.out.println();
        }
    }

}
