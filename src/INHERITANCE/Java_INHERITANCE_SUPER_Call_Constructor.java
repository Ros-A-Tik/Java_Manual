package INHERITANCE;

class Java_INHERITANCE_SUPER_Box {
    private double width;
    private double height;
    private double depth;

    Java_INHERITANCE_SUPER_Box(Java_INHERITANCE_SUPER_Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Java_INHERITANCE_SUPER_Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Java_INHERITANCE_SUPER_Box () {
        width = 0;
        height = 0;
        depth = 0;
    }

    Java_INHERITANCE_SUPER_Box (double len) {
        width = height = depth = len;
    }

    double volume () {
        return width * height * depth;
    }
}

class Box_Weight extends Java_INHERITANCE_SUPER_Box {
    double weight;

    Box_Weight (Box_Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box_Weight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box_Weight() {
        super();
        weight =0;
    }

    Box_Weight (double len, double m) {
        super(len);
        weight = m;
    }
}

class Test {
    public static void main (String [] args) {

        Box_Weight b_1 = new Box_Weight();
        Box_Weight b_2 = new Box_Weight(10, 20);
        Box_Weight b_3 = new Box_Weight (10, 20, 30, 40);
        Box_Weight b_4 = new Box_Weight (b_1);

        double vol;

        vol = b_1.volume();
        System.out.println("Volume of the box \"b_1\" is: " + vol + " and weight is: " + b_1.weight);
        System.out.println();

        vol = b_2.volume();
        System.out.println("Volume of the box \"b_2\" is: " + vol + " and weight is: " + b_2.weight);
        System.out.println();

        vol = b_3.volume();
        System.out.println("Volume of the box \"b_3\" is: " + vol + " and weight is: " + b_3.weight);
        System.out.println();

        vol = b_4.volume();
        System.out.println("Volume of the box \"b_4\" is: " + vol + " and weight is: " + b_4.weight);
        System.out.println();

    }
}
