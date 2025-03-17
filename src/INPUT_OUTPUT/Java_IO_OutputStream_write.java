package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_OutputStream_write {

    public static void main (String[] args) throws Exception {
        byte b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');

        b = 'B';
        System.out.write(b);
        System.out.write('\n');

        String stra = "write() method is a good method";
        System.out.write(stra.getBytes());

    }
}
