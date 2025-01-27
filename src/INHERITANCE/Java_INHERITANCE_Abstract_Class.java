package INHERITANCE;

abstract class Java_INHERITANCE_Abstract_Class_Figure {
    double dim_1;
    double dim_2;

    Java_INHERITANCE_Abstract_Class_Figure (double a, double b) {
        dim_1 = a;
        dim_2 = b;
    }

    abstract double area();
}

class Java_INHERITANCE_Abstract_Class_Rectangle extends Java_INHERITANCE_Abstract_Class_Figure {
    Java_INHERITANCE_Abstract_Class_Rectangle (double a, double b) {
        super(a, b);
    }

    double area () {
        System.out.println("Inside Area for Rectangle.");
        return dim_1 * dim_2;
    }
}

class Java_INHERITANCE_Abstract_Class_Triangle extends Java_INHERITANCE_Abstract_Class_Figure {

    Java_INHERITANCE_Abstract_Class_Triangle (double a, double b) {
        super (a, b);
    }

    double area() {
        System.out.println("\"Inside Area for Triangle.\"");
        return dim_1 * dim_2 / 2;
    }
}

class Java_INHERITANCE_Abstract_Class {

    public static void main(String[] args) {
//        Java_INHERITANCE_Abstract_Class_Figure f = new Java_INHERITANCE_Abstract_Class_Figure(10, 10); // Illegal expression;
        Java_INHERITANCE_Abstract_Class_Rectangle r = new Java_INHERITANCE_Abstract_Class_Rectangle(10, 10);
        Java_INHERITANCE_Abstract_Class_Triangle t = new Java_INHERITANCE_Abstract_Class_Triangle(10, 10);

        Java_INHERITANCE_Abstract_Class_Figure fig;

        fig = r;
        System.out.println("Area is: " + fig.area());

        fig = t;
        System.out.println("Area is: " + t.area());
    }
}
