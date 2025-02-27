package ANNOTATIONS;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAno {
    String stra();
    int vala();
}

public class Meta {

    @MyAno (stra = "Annotation Example", vala = 100)

    public static void myMetha() {
        Meta oba = new Meta();

        try {
            Class<?> ca = oba.getClass();
            Method ma = ca.getMethod("myMetha");
            MyAno ano = ma.getAnnotation(MyAno.class);

            System.out.println(ano.stra() + " " + ano.vala());
        } catch (Exception e) {
            System.out.println("Error! Be careful! " + e);
        }
    }

    public static void main (String[] args) {
        myMetha();
    }
}
