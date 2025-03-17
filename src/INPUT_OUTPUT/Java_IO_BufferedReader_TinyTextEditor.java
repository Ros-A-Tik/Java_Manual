package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_BufferedReader_TinyTextEditor  {

    public static Java_IO_BufferedReader_readLIne brl = new Java_IO_BufferedReader_readLIne();

    public static String[] str = new String[100];

    public static void textWriter() throws Exception {

        System.out.println(brl.strLine + "\n" + brl.strStop);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals(brl.stp)) {
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (str[i].equals(brl.stp)) {
                break;
            } else {
                System.out.println(str[i]);
            }
        }
    }

    public static void main (String[] args) throws Exception {

        textWriter();

    }
}
