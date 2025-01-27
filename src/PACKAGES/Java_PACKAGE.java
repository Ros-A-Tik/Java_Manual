package PACKAGES;

class Balance {
    String name;
    double bal;

    Balance (String n, double b) {
        name = n;
        bal = b;
    }

    void showBal() {
        if (bal < 0) {
            System.out.println("The balance " + name + " is negative: " + bal);
        } else {
            System.out.println("The balance " + name + " is positive: " + bal);
        }
    }
}

public class Java_PACKAGE {
    public static void main (String [] args) {
        Balance [] current = new Balance [3];
        current [0] = new Balance("RVS", -100.00);
        current [1] = new Balance("BS", 200.00);
        current [2] = new Balance("FC", 3000.00);

        for (int i = 0; i < current.length;  i++) {
            current[i].showBal();
        }
    }
}
