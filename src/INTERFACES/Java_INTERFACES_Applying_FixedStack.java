package INTERFACES;

public class Java_INTERFACES_Applying_FixedStack implements Java_INERFACES_Applying_IntStack {

    private int [] stck;
    private int tos;

    Java_INTERFACES_Applying_FixedStack (int size) {
        stck = new int [size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length-1) {
            System.out.println("The Stack is full.");
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
