package INTERFACES;

public class Java_INTERFACES_Applying_DynStack implements Java_INERFACES_Applying_IntStack {
    private int[] stck;
    private int tos;

    Java_INTERFACES_Applying_DynStack (int size) {
        stck = new int [size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length) {

            int[] temp = new int[stck.length * 2];

            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
                stck = temp;
                stck[++tos] = item;
            }
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
