package INHERITANCE;

class Java_INHERITANCE_Box {
    double width;
    double height;
    double depth;

    Java_INHERITANCE_Box () {
        width = 0;
        height = 0;
        depth = 0;
    }

    Java_INHERITANCE_Box (Java_INHERITANCE_Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Java_INHERITANCE_Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Java_INHERITANCE_Box(double len) {
        width = height = depth = len;
    }

    double volume () {
        return width * height * depth;
    }
}

class Java_INHERITANCE_Box_Weight extends Java_INHERITANCE_Box {

    double weight;

    Java_INHERITANCE_Box_Weight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class Java_INHERITANCE_Box_Test {

    public static void main (String [] args) {

        Java_INHERITANCE_Box_Weight mb1 = new Java_INHERITANCE_Box_Weight(10, 20, 30, 40);
        System.out.println("Volume of the mb1 is: " + mb1.volume() + ". The weight of mb1 is: " + mb1.weight);

        System.out.println();
        Java_INHERITANCE_Box_Weight mb2 = new Java_INHERITANCE_Box_Weight(50, 60, 70, 80);
        System.out.println("Volume of the mb2 is: " + mb2.volume() + ". The weight of mb1 is: " + mb2.weight);

        System.out.println();
        mb1 = new Java_INHERITANCE_Box_Weight(11, 21, 31, 41);
        System.out.println("Volume of the mb1 is: " + mb1.volume() + ". The weight of mb1 is: " + mb1.weight);
    }
}