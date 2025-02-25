package AUTOBOXING;

public class Java_AUTOBOXING_Values_BooleanCharacter {
    public static void main (String[] args) {
        Boolean b = true;

        if (b) {
            System.out.println("b is true");
        }

        Character ch = 'x';
        char ch_1 = ch;

        b = false;

        if(!b) {
            System.out.println(ch_1);
        }


    }
}
