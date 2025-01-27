package INHERITANCE;

class Java_INHERITANCE_Multilevel_Hierarchy {

    private double width;
    private double height;
    private double depth;

    Java_INHERITANCE_Multilevel_Hierarchy() {
        width = 0;
        height = 0;
        depth = 0;
    }

    Java_INHERITANCE_Multilevel_Hierarchy(Java_INHERITANCE_Multilevel_Hierarchy ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Java_INHERITANCE_Multilevel_Hierarchy (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Java_INHERITANCE_Multilevel_Hierarchy(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class Java_INHERITANCE_Multilevel_Weight extends Java_INHERITANCE_Multilevel_Hierarchy {
    double weight;

    Java_INHERITANCE_Multilevel_Weight() {
        super();
        weight = 0;
    }

    Java_INHERITANCE_Multilevel_Weight (Java_INHERITANCE_Multilevel_Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Java_INHERITANCE_Multilevel_Weight (double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Java_INHERITANCE_Multilevel_Weight (double len, double m)  {
        super(len);
        weight = m;
    }
}

class Coste extends Java_INHERITANCE_Multilevel_Weight {
    double cos;

    Coste() {
        super();
        cos = 0;
    }

    Coste(Coste ob) {
        super(ob);
        cos = ob.cos;
    }

    Coste(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cos = c;
    }

    Coste(double len, double m, double c) {
        super(len, m);
        cos = c;
    }
}

class Execute extends Coste {
    public static void main (String [] args) {
        Coste c_1 = new Coste();
        Coste c_2 = new Coste(10, 20, 30, 40, 50);
        Coste c_3 = new Coste (10, 20, 30);
        Coste c_4 = new Coste(c_2);

        System.out.println("c_1: volume: " + c_1.volume() + "; weight: " + c_1.weight + "; cost: " + c_1.cos);
        System.out.println("c_2: volume: " + c_2.volume() + "; weight: " + c_2.weight + "; cost: " + c_2.cos);
        System.out.println("c_3: volume: " + c_3.volume() + "; weight: " + c_3.weight + "; cost: " + c_3.cos);
        System.out.println("c_4: volume: " + c_4.volume() + "; weight: " + c_4.weight + "; cost: " + c_4.cos);
    }
}
