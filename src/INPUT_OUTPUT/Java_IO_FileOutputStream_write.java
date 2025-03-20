package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileOutputStream_write {

    public static Java_IO_File f = new Java_IO_File();
    public static String dirFosName = "D:/FileOutPutStream";
    public static String fileFosName = "File_Output_Stream.txt";

    public static Java_IO_FileInputStream_read jIoFis = new Java_IO_FileInputStream_read();
    public static String fileFisName = jIoFis.dirName + "/" + jIoFis.fileName;


    public static String newText = "/* Copy a file.\n" +
            "To use this program, specify the name\n" +
            "of the source file and the destination file.\n" +
            "For example, to copy a file called FIRST.TXT\n" +
            "to a file called SECOND.TXT, use the following\n" +
            "command line.\n" +
            "java CopyFile FIRST.TXT SECOND.TXT\n" +
            "*/\n" +
            "import java.io.*;\n" +
            "class CopyFile {\n" +
            "\typublic static void main(String[] args) throws IOException {\n" +
            "\t\tint i;\n" +
            "\t\tFileInputStream fin = null;\n" +
            "\t\tFileOutputStream fout = null;\n" +
            "\t\t// First, confirm that both files have been specified.\n" +
            "\t\tif(args.length != 2) {\n" +
            "\t\t\tSystem.out.println(\"Usage: CopyFile from to\");\n" +
            "\t\t\treturn;\n" +
            "\t\t}\n" +
            "\t\t// Copy a File.\n" +
            "\t\ttry {\n" +
            "\t\t\t// Attempt to open the files.\n" +
            "\t\t\tfin = new FileInputStream(args[0]);\n" +
            "\t\t\tfout = new FileOutputStream(args[1]);\n" +
            "\t\t\tdo {\n" +
            "\t\t\t\ti = fin.read();\n" +
            "\t\t\t\tif(i != -1) fout.write(i);\n" +
            "\t\t\t\t} while(i != -1);\n" +
            "\t\t\t} catch(IOException e) {\n" +
            "\t\t\t\tSystem.out.println(\"I/O Error: \" + e);\n" +
            "\t\t\t} finally {\n" +
            "\t\t\ttry {\n" +
            "\t\t\t\tif(fin != null) fin.close();\n" +
            "\t\t\t\t} catch(IOException e2) {\n" +
            "\t\t\t\t\tSystem.out.println(\"Error Closing Input File\");\n" +
            "\t\t\t\t}" +
            "\t\t\ttry {\n" +
            "\t\t\t\tif(fout != null) fout.close();\n" +
            "\t\t\t} catch(IOException e2) {\n" +
            "\t\t\t\tSystem.out.println(\"Error Closing Output File\");\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";

    public static void fileOutputStream_write (String dirFosName, String fileFosName) throws Exception {
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

    public static void fileOutputStream_append (String dirName, String fileName) throws Exception {

        String fName = dirName + "/" + fileName;

         try {
            FileOutputStream fos = new FileOutputStream(fName);
            String nTxt = jIoFis.textWrite + "\n\n\n" + newText;
            fos.write(nTxt.getBytes());
            fos.close();
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
        fileOutputStream_write(dirFosName, fileFosName);

        //add data to file
        fileOutputStream_append(dirFosName, fileFosName);

    }
}