package ANNOTATIONS;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface My_Ano {
    String str_c();
    int val_c();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What (description = "An annotation test class")
@My_Ano (str_c = "Meta_2", val_c = 99)

public class Java_ANNOTATIONS_ObtainingAllAnnotations {

    @What (description = "An annotation test method")
    @My_Ano (str_c = "Testing", val_c = 100)

    public static void My_Meth() {

        Java_ANNOTATIONS_ObtainingAllAnnotations ob_c = new Java_ANNOTATIONS_ObtainingAllAnnotations();

        try {
            Annotation[] annos = ob_c.getClass().getAnnotations();
            System.out.println("All annotations for this class are: ");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m_c = ob_c.getClass().getMethod("My_Meth");
            annos = m_c.getAnnotations();

            System.out.println("All annotations for My_Meth are: ");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Error! Be careful !! " + e);
        }
    }

    public static void main (String[] args) {
        My_Meth();

    }
}
