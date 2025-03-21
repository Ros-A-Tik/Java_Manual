package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileReader {

    public static String fName;

    public static void fileReader (String fileName) throws Exception {
        fName = fileName;
        FileReader fr = new FileReader(fName);
        int i = fr.read();
        do {
             System.out.print((char) i);
         } while ((i = fr.read()) != -1);

        fr.close();
    }

    public static void main (String[] args) throws Exception {
        fileReader("D:/JVA/My_First_File.txt");
    }
}
