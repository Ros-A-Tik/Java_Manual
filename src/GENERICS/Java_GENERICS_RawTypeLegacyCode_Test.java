package GENERICS;

import java.io.*;


public class Java_GENERICS_RawTypeLegacyCode_Test {

    public static Java_GENERICS_RawTypeLegacyCode <Integer> intOb = new Java_GENERICS_RawTypeLegacyCode<>(88);
    public static Java_GENERICS_RawTypeLegacyCode <String> strOb = new Java_GENERICS_RawTypeLegacyCode<>("Hello Ros-A-Tik");
    public static Java_GENERICS_RawTypeLegacyCode <Character> charOb = new Java_GENERICS_RawTypeLegacyCode<>('a');

    public static Java_GENERICS_RawTypeLegacyCode rawType_Double = new Java_GENERICS_RawTypeLegacyCode(Double.valueOf(88.8));
    public static Java_GENERICS_RawTypeLegacyCode rawType_String = new Java_GENERICS_RawTypeLegacyCode(String.valueOf("Ros-A-Tik"));
    public static Java_GENERICS_RawTypeLegacyCode rawType_Char = new Java_GENERICS_RawTypeLegacyCode(String.valueOf('R'));

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static void main (String[] args) {

        pw.println(intOb.getOb());
        pw.println(strOb.getOb());
        pw.println(charOb.getOb());
        pw.println(rawType_Double.getOb());
        pw.println(rawType_String.getOb());
        pw.println(rawType_Char.getOb());

    }

}
