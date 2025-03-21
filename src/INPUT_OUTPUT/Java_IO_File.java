package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_File {

    public static String dName = "D:\\JVA";
    public static String dsName = "D:\\JVAS\\MyFile";
    public static String fName = "My_First_File.txt";

    public static boolean dirCreate = false;

    public static File f;
    public static PrintWriter pw = new PrintWriter (System.out, true);

    public static void createDirectory(String dirName) {

        String dName = dirName;

        try {
            f = new File(dName);
            dirCreate = f.mkdir();
            if (f.exists()) {
                pw.println("The Directory exists.");
            } else {
                pw.println("The Directory is not created.");
            }
        } catch (Exception e) {
            pw.println("Error! " + e);
        }
    }

    public static void createDirectores(String dirsName) {

        String dsName = dirsName;

        try {
            f = new File(dsName);
            dirCreate = f.mkdirs();
            if (f.exists()) {
                pw.println("The Directory exists.");
            } else {
                pw.println("The Directory is not created.");
            }
        } catch (Exception e) {
            pw.println("Error! " + e);
        }
    }

    public static void createFile (String dirName, String fileName) {

        String fName = fileName;
        String dName = dirName;

        try {
            f = new File(dName + "\\" +fName);
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

    public static void createFiles (String dirsName, String fileName) {

        String dsName = dirsName;
        String fName = fileName;

        try {
            f = new File(dsName + "/" + fName);
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

        createDirectory(dName);
        createFile(dName, fName);

        createDirectores(dsName);
        createFiles(dsName, fName);

    }
}