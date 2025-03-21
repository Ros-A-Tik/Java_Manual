package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileWriter {

    public static String textToWriteFile;
    public static String fName;

    public static void fileWriter (String text, String pathName) throws Exception {

        textToWriteFile = text;
        fName = pathName;

        FileWriter fw = new FileWriter(fName);
        try {
            fw.write(textToWriteFile);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    public static void main (String[] args) throws Exception {

        fileWriter("Hello World!", "D:/JVA/My_First_File.txt");
    }
}