package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileInputStream_FileOutPoutStream {

    public static String dName = "D:\\JVA";
    public static String fName = "D:\\JVA\\My_First_File.txt";
    public static boolean bool = false;

    public static File f;
    public static PrintWriter pw = new PrintWriter(System.out, true);

    public static void createDirectory() {
        try {
            f = new File(dName);
            bool = f.mkdir();
            if (f.exists()) {
                pw.println("The Directory exists.");
            } else {
                pw.println("The Directory is not created.");
            }
        } catch (Exception e) {
            pw.println("Error! " + e);
        }
    }

    public static void createFile () {
        try {
            f = new File(fName);
            if (f.exists()) {
                pw.println("The File with the same name exists");
            } else if (f.createNewFile()) {
                pw.println("The File is created.");
            } else {
                pw.println("The File is not created.");
            }
        } catch (Exception e) {
            pw.println("Error! " + e);
        }
    }

    public static void main (String[] args) {

        createDirectory();
        createFile();

    }
}