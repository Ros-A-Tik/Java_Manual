package INHERITANCE;

class Java_INHERITANCE_SUPER_Call_Variable {
    int x;
}

class Java_INHERITANCE_SUPER_Variable_B extends Java_INHERITANCE_SUPER_Call_Variable {
    int x;

    Java_INHERITANCE_SUPER_Variable_B (int a, int b) {
        super.x = a;
        x = b;
    }

    void show() {
        System.out.println("The \"x\" from superclass is: " + super.x);
        System.out.println("The \"x\" from subclass is: " + x);

    }
}

class TestShow {
    public static void main (String [] args) {
        Java_INHERITANCE_SUPER_Variable_B s_1 = new Java_INHERITANCE_SUPER_Variable_B(10, 30);

        s_1.show();
    }
}

