package INHERITANCE;


//The method with "final" modifier  can not be overridden.
//THe class with "final" modifier can not be inherited.


class Java_INHERITANCE_Method_Final extends Method_Final {
    public static void main (String [] args) {

        Method_Final mf = new Method_Final();
        mf.meth();

//         void meth() {
//            System.out.println("Fuck");
//        }
    }
}

class Method_Final {
    final void meth() {
        System.out.println("This is a method with \"final\" modifier.");
    }
}
