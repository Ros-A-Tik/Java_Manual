package ANNOTATIONS;

import java.lang.annotation.*;
import java.lang.reflect.*;

//A simple annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val ();
}

class Java_ANNOTATIONS_Basics {

    @MyAnno (str = "Annotation Example", val = 100)

    public static void myMeth() {

        Java_ANNOTATIONS_Basics ob = new Java_ANNOTATIONS_Basics();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("MyAnno");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (Exception e) {
            System.out.println("Error! Be careful! " + e);
        }
    }

    public static void main (String[] args) {
        myMeth();
    }
}