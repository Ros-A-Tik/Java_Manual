package ANNOTATIONS;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface M_Ano {
    String str_b();
    int val_b();
}

public class Java_ANNOTATIONS_Reflection {
    @M_Ano (str_b = "Two parameters", val_b = 19)

    public static void myMeth_b(String str, int i) {

        Java_ANNOTATIONS_Reflection ob_b = new Java_ANNOTATIONS_Reflection();

        try {
            Class<?> c_b = ob_b.getClass();
            Method m_b = c_b.getMethod("myMeth_b", String.class, int.class);
            M_Ano ano_b = m_b.getAnnotation(M_Ano.class);

            System.out.println(ano_b.str_b() + " " + ano_b.val_b());
        } catch (Exception e) {
            System.out.println("Error! Be careful!! " + e);
        }
    }

    public static void main (String[] args) {
        myMeth_b("test", 10);
    }
}
