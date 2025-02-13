package ENUMERATIONS;

public class Java_ENUMERATIONS_AnotherExample_AskMe {

    public static void answer (Java_ENUMERATIONS_AnotherExample result) {
        switch (result) {
            case NO:
                System.out.println(Java_ENUMERATIONS_AnotherExample.NO);
                break;
            case YES:
                System.out.println(Java_ENUMERATIONS_AnotherExample.YES);
                break;
            case MAYBE:
                System.out.println(Java_ENUMERATIONS_AnotherExample.MAYBE);
                break;
            case LATER:
                System.out.println(Java_ENUMERATIONS_AnotherExample.LATER);
                break;
            case SOON:
                System.out.println(Java_ENUMERATIONS_AnotherExample.SOON);
                break;
            case NEVER:
                System.out.println(Java_ENUMERATIONS_AnotherExample.NEVER);
                break;
        }
    }
}