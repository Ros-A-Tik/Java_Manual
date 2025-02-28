package ANNOTATIONS;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface My_Anno {
    String str() default "Testing";
    int val() default 9000;
}

public class Java_ANNOTATIONS_UsingDefaultValues {

    @My_Anno()

    public static void myMeth_1 () {
        Java_ANNOTATIONS_UsingDefaultValues ob_1 = new Java_ANNOTATIONS_UsingDefaultValues();

        try {
            Class<?> c_r = ob_1.getClass();
            Method m_r = c_r.getMethod("myMeth_1");
            My_Anno ano_r = m_r.getAnnotation(My_Anno.class);

            System.out.println(ano_r.str() + " " + ano_r.val());
        }catch (Exception e) {
            System.out.println("Error! Be careful!! " + e);
        }
    }

    public static void main (String[] args) {
        myMeth_1();
    }
}
