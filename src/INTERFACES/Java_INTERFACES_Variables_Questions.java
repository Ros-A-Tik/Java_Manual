package INTERFACES;

import java.util.Random;

public class Java_INTERFACES_Variables_Questions implements Java_INTERFACES_Variables_SharedConstants {

    Random rand = new Random();

    public int ask () {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        } else {
            return NEVER;
        }
    }

}
