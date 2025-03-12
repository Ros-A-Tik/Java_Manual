package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileInputStream_FileOutPoutStream {

    public static String fName = "My_First_File.txt";

    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static void createFile () {
        try {
            File f = new File(fName);
            if(f.createNewFile()) {
                pw.println("File is created.");
            } else {
                pw.println("File is not created.");
            }
        } catch (Exception e) {
            pw.println("Error! " + e);
        }
    }

    public static void main (String[] args) {
        createFile();
    }
}
