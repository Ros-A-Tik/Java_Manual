package LAMBDA;

import java.io.*;

public class Java_LAMBDA_MethodReferences_InstanceMethod_Test {

    static PrintWriter pw = new PrintWriter (System.out, true);

   static String str_Instance_Op(Java_LAMBDA_MethodReferences<String> sf, String s) {
       return sf.func(s);
   }

   public static void main (String[] args) {

       String inStr = "lambda add power to Java.";
       String outStr;

       Java_LAMBDA_MethodReferences_InstanceMethod obStr = new Java_LAMBDA_MethodReferences_InstanceMethod();

       outStr = str_Instance_Op(obStr::reverse_Instance, inStr);

       pw.println("Origin string is: " + inStr);
       pw.println("Reversed string is: " + outStr);

   }

}