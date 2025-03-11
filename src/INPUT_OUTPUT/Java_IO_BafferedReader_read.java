package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_BafferedReader_read {

    public static void main(String[] args) throws Exception {

        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println("Entre a characters, please. For EXIT pres \"q\"");

        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');

    }
}

