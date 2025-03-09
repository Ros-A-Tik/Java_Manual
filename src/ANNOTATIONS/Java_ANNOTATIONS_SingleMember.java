package ANNOTATIONS;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@interface SingleMember {
    int value();
}

public class Java_ANNOTATIONS_SingleMember {
    @SingleMember(100)
    public static void myMeth() {
        Java_ANNOTATIONS_SingleMember ob_single = new Java_ANNOTATIONS_SingleMember();
         try {
//             Class<?> c = ob_single.getClass(); //or
//             Method m = c.getMethod("myMeth"); //or
//             Method m = ob_single.getClass().getMethod("myMeth"); //or
             SingleMember an = ob_single.getClass().getMethod("myMeth").getAnnotation(SingleMember.class);
             System.out.println(an.value());
         } catch (Exception e) {
             System.out.println("Error! Be careful! " + e);
         }
    }

    public static void main (String[] args) {
        myMeth();
    }
}
