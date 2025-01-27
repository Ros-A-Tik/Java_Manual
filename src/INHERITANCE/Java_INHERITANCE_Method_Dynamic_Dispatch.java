package INHERITANCE;

import org.w3c.dom.ls.LSOutput;

class Dispatch_A {
    void callMe () {
        System.out.println("Inside class \"A\" callMe method.");
    }
}

class Dispatch_B extends Dispatch_A {
    void callMe() {
        System.out.println("Inside class \"B\" callMe method.");
    }
}

class Dispatch_C extends Dispatch_A {
    void callMe() {
        System.out.println("Inside class \"C\" callMe method.");
    }
}

class Java_INHERITANCE_Method_Dynamic_Dispatch {
    public static void main(String[] args) {
        Dispatch_A a = new Dispatch_A();
        Dispatch_B b = new Dispatch_B();
        Dispatch_C c = new Dispatch_C();

        Dispatch_A r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();

    }
}
