package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_BufferedReader_TinyTextEditor  {

    public static String[] str = new String[100];

    public static void main (String[] args) throws Exception {

        Java_IO_BufferedReader_readLIne brl = new Java_IO_BufferedReader_readLIne();

        System.out.println(brl.strLine + "\n" + brl.strStop);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals(brl.stp)) {
                break;
            }
        }

        for(int i = 0; i < 100; i++) {
            if(str[i].equals(brl.stp)) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
