package CLASSES;

public class Java_CLASSES_Vararg_Inference {

    private int i;

    Java_CLASSES_Vararg_Inference (int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k>= 0) {
            i = k;
        }
    }

}

class Java_CLASSES_Vararg_Inference_Test {
    public static void main(String[] args) {
        var mc = new Java_CLASSES_Vararg_Inference(10);
        System.out.println(mc.getI());
        mc.setI(19);
        System.out.println(mc.getI());
    }

}
