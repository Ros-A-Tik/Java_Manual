package INTERFACES;

public class Square implements SquareCalc {

    public void Square_Calc_Quadrangle (double width, double length) {

        double s = width * length;

        System.out.println ("The square of quadrangle with width " + width + " cm and length " + length + " cm is: " + s + " cm2");
    }

    public void Square_Calc_Cycle (double radius) {

        double s = (3.14 * radius) * (3.14 * radius);

        System.out.println ("The square of the cycle with radius " + radius + " cm is: " + s + " cm2");
    }
}
