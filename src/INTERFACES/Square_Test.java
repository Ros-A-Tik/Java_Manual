package INTERFACES;

public class Square_Test extends Square implements SquareCalc {

    public void Square_Calc_Quadrangle (double width, double length) {
        double s = width * length;
        System.out.println("Square of the quadrangle from this class with width " + width + " cm and length " + length + " cm is: " + s + " cm2");
    }

    public void Square_Calc_Cycle(double radius) {
        double s = (3.14 * radius) * (3.14 * radius);
        System.out.println("Square of the cycle from this class with radius " + radius + " cm is: " + s + " cm2");
    }

    public static void main (String [] args) {
        Square s = new Square();
        s.Square_Calc_Quadrangle(9, 9);
        s.Square_Calc_Cycle(9);

        System.out.println();

        Square_Test st = new Square_Test();
        st.Square_Calc_Quadrangle(7, 7);
        st.Square_Calc_Cycle(7);

    }
}
