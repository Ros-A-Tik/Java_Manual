package ANNOTATIONS;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

@Target(ElementType.TYPE_USE)
@interface Unique {}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What_ {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {}

@Target(ElementType.METHOD)
@interface Recommended {}

public class Java_ANNOTATIONS_TypeAnnoDemo<@What_ (description = "Generic data type") T> {

    public @Unique Java_ANNOTATIONS_TypeAnnoDemo () {}

    @TypeAnno String str;

    @EmptyOK String test;

    public int f(@TypeAnno Java_ANNOTATIONS_TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    public @TypeAnno Integer f2 (int j, int k) {
        return j + k;
    }

    public @Recommended Integer f3 (String str) {
        return str.length() / 2;
    }

    public void f4 () throws @TypeAnno NullPointerException {
        //....
        System.out.println("FUCK");
    }

    String @MaxLen (10) [] @NotZeroLen [] w;

    @TypeAnno Integer [] vec;

    public static void myMeth(int i) {

        Java_ANNOTATIONS_TypeAnnoDemo<@TypeAnno Integer> o = new Java_ANNOTATIONS_TypeAnnoDemo<@TypeAnno Integer>();
        @Unique Java_ANNOTATIONS_TypeAnnoDemo<Integer> o_1 = new @Unique Java_ANNOTATIONS_TypeAnnoDemo<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        y = (@TypeAnno Integer) x;
    }

    public static void main (String [] args) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno Java_ANNOTATIONS_TypeAnnoDemo<Boolean> {}

}