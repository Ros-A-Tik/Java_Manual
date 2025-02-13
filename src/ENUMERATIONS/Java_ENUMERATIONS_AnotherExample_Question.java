package ENUMERATIONS;
import java.util.Random;

public class Java_ENUMERATIONS_AnotherExample_Question {

    Random rand = new Random();

    Java_ENUMERATIONS_AnotherExample ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Java_ENUMERATIONS_AnotherExample.MAYBE;
        } else if (prob < 30) {
            return Java_ENUMERATIONS_AnotherExample.NO;
        } else if (prob < 60) {
            return Java_ENUMERATIONS_AnotherExample.YES;
        } else if (prob < 70) {
            return Java_ENUMERATIONS_AnotherExample.LATER;
        } else if (prob < 98) {
            return Java_ENUMERATIONS_AnotherExample.SOON;
        } else {
            return Java_ENUMERATIONS_AnotherExample.NEVER;
        }
    }
}
