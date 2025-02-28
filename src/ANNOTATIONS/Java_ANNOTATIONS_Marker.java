package ANNOTATIONS;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

public class Java_ANNOTATIONS_Marker {

    @MyMarker

    public static void myMeth () {
        Java_ANNOTATIONS_Marker ob = new Java_ANNOTATIONS_Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    public static void main (String[] args) {
        myMeth();
    }
}
