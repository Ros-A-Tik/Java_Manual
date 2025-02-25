package WRAPPERS;

public class Java_WRAPPERS_Character {
    public static Character ch = 'G';
    public static Character ch_1 = 'H';

    public static Integer i = Integer.valueOf(100);
    public static int i_1;

    public static void main (String[] args){
      System.out.println(ch.valueOf('J'));
      i_1 = i;
      System.out.println(i_1 + ", " + i);
      i_1 = i.valueOf(200);
      System.out.println(i_1 + ", " + i);
      System.out.println(i_1 + ", " + i.valueOf(300));

        System.out.println(i.getClass());
    }
}
