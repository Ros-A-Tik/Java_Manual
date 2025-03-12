package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_BufferedReader_readLIne {

    public static String str;
    public static String strLine = "Enter a line of text, please.";
    public static String strStop = "Enter a \"stop\" to quit.";
    public static String stp = "stop";

    public static void main (String[] args)  throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println(strLine + "\n" + strStop);

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals(stp));
    }
}
