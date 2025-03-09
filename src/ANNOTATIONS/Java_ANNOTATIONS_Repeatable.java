package ANNOTATIONS;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface M_ano_1 {
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    M_ano_1 [] value();
}

public class Java_ANNOTATIONS_Repeatable {

    @M_ano_1 (str = "First Annotation", val = -1)
    @M_ano_1 (str = "Second Annotation", val =100)

    public static void myMeth(String str, int i) {
        Java_ANNOTATIONS_Repeatable o = new Java_ANNOTATIONS_Repeatable();
        try {
            Class<?> c = o.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation a = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(a);
        }catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    public static void main (String[] args) {
        myMeth("test", 10);
    }
}
