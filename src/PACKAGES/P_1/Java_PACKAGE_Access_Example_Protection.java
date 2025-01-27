package PACKAGES.P_1;

public class Java_PACKAGE_Access_Example_Protection {

    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Java_PACKAGE_Access_Example_Protection () {
        System.out.println("Base constructor: ");
        System.out.println("Variable without modifier \"n\" = " + n);
        System.out.println("Private variable \"n_pri\" = " + n_pri);
        System.out.println("Protected variable \"n_pro\" = " + n_pro);
        System.out.println("Public variable \"n_pub\" = " + n_pub);
    }

}