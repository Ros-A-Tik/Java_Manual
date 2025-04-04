package GENERICS;

public class Java_GENERICS_WildCard_Bounded_Cords<T extends Java_GENERICS_WildCard_Bounded_TwoD> {
    public T [] coords;

    Java_GENERICS_WildCard_Bounded_Cords(T [] o) {
        coords = o;
    }

    public static void showXY(Java_GENERICS_WildCard_Bounded_Cords <?> c) {
        System.out.println("\"X\" and \"Y\" coordinates are: ");
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

    public static void main (String[] args) {

        Java_GENERICS_WildCard_Bounded_TwoD [] td = {
                new Java_GENERICS_WildCard_Bounded_TwoD(0, 1),
                new Java_GENERICS_WildCard_Bounded_TwoD(1, 2),
                new Java_GENERICS_WildCard_Bounded_TwoD(2, 3),
                new Java_GENERICS_WildCard_Bounded_TwoD(3, 4)
        };

        Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_TwoD> tdlocs = new Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_TwoD>(td);
        System.out.println("Two dimensional coordinate are: ");
        showXY(tdlocs);

        Java_GENERICS_WildCard_Bounded_ThreeD [] thd = {
                new Java_GENERICS_WildCard_Bounded_ThreeD(0, 1, 2),
                new Java_GENERICS_WildCard_Bounded_ThreeD(1, 2, 3),
                new Java_GENERICS_WildCard_Bounded_ThreeD(2, 3, 4),
                new Java_GENERICS_WildCard_Bounded_ThreeD(3, 4, 5)
        };
        Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_ThreeD> thdlocs = new Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_ThreeD>(thd);
        System.out.println("Two dimensional coordinate are: ");
        showXYZ(thdlocs);

        Java_GENERICS_WildCard_Bounded_FourD [] fd = {
                new Java_GENERICS_WildCard_Bounded_FourD(0, 1, 2, 3),
                new Java_GENERICS_WildCard_Bounded_FourD(1, 2, 2, 4),
                new Java_GENERICS_WildCard_Bounded_FourD(2, 3, 4, 5),
                new Java_GENERICS_WildCard_Bounded_FourD(3, 4, 5, 6)
        };
        Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_FourD> fdlocs = new Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_FourD>(fd);
        System.out.println("Two dimensional coordinate are: ");
        showXYZT(fdlocs);

        Java_GENERICS_WildCard_Bounded_FourD [] fdd = {
                new Java_GENERICS_WildCard_Bounded_FourD(0, 1, 2, 3),
                new Java_GENERICS_WildCard_Bounded_FourD(1, 2, 2, 4),
                new Java_GENERICS_WildCard_Bounded_FourD(2, 3, 4, 5),
                new Java_GENERICS_WildCard_Bounded_FourD(3, 4, 5, 6)
        };
        Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_FourD> fddlocs = new Java_GENERICS_WildCard_Bounded_Cords<Java_GENERICS_WildCard_Bounded_FourD>(fdd);
        System.out.println("Two dimensional coordinate are: ");
        showXY(fddlocs);

    }

}
