package GENERICS;

public class Java_GENERICS_BoundedTypes<T extends Number> {

    T[] nums;

    Java_GENERICS_BoundedTypes(T[] o) {
        nums = o;
    }

    double avarage() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

}
