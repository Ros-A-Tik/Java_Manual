package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileOutputStream_write {

    public static Java_IO_File f = new Java_IO_File();
    public static String dirFosName = "D:/FileOutPutStream";
    public static String fileFosName = "File_Output_Stream.txt";

    public static Java_IO_FileInputStream_read jIoFis = new Java_IO_FileInputStream_read();
    public static String fileFisName = jIoFis.dirName + "/" + jIoFis.fileName;

    public static void fileOutputStream (String dirFosName, String fileFosName) throws Exception {
        int i;
        String fileName = dirFosName + "/" + fileFosName;

        FileInputStream fis = null;
        FileOutputStream fos = null;

        //Copy file
        try {
            fis = new FileInputStream(fileFisName);
            fos = new FileOutputStream(fileName);

            do {
                i = fis.read();
                if (i != -1) {
                    fos.write(i);
                }
            } while (i != -1);

        } catch (Exception e) {
            System.out.println("Error! " + e);
        }

        try {
            if(fis != null) {
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }

        try {
            if (fis != null) {
                fos.close();
            }
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }
    }

    public static void main (String[] args) throws Exception {

        //Create a new directory for new file File_Output_Stream.txt
        f.createDirectory(dirFosName);
        //create a new file File_Output_Stream.txt in new directory
        f.createFile(dirFosName, fileFosName);
        //Copy file
        fileOutputStream(dirFosName, fileFosName);

    }
}