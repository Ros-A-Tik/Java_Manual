package GENERICS;

public class Java_GENERICS_WildcardArguments<T extends Number> {
    T[] nums;

    Java_GENERICS_WildcardArguments(T[] o) {
        nums = o;
    }

    double avarage() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAverage(Java_GENERICS_WildcardArguments<?> ob) {
        if(avarage() == ob.avarage()) {
            return true;
        }
        return false;
    }
}
