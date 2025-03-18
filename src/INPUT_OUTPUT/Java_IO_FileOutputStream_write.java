package INPUT_OUTPUT;

import java.io.*;

public class Java_IO_FileOutputStream_write {

    public static Java_IO_File f = new Java_IO_File();
    public static String dirFosName = "D:/FileOutPutStream";
    public static String fileFosName = "File_Output_Stream.txt";

    public static Java_IO_FileInputStream_read jIoFis = new Java_IO_FileInputStream_read();
    public static String fileFisName = jIoFis.dirName + "/" + jIoFis.fileName;

    public static String fisTextWrite = "/* Copy a file.\n" +
            "To use this program, specify the name\n" +
            "of the source file and the destination file.\n" +
            "For example, to copy a file called FIRST.TXT\n" +
            "to a file called SECOND.TXT, use the following\n" +
            "command line.\n" +
            "java CopyFile FIRST.TXT SECOND.TXT\n" +
            "*/\n" +
            "import java.io.*;\n" +
            "class CopyFile {\n" +
            "\tpublic static void main(String[] args) throws IOException\n" +
            "\t\t{\n" +
            "\t\t\tint i;\n" +
            "\t\t\tFileInputStream fin = null;\n" +
            "\t\t\tFileOutputStream fout = null;\n" +
            "\t\t\t// First, confirm that both files have been specified.\n" +
            "\t\t\tif(args.length != 2) {\n" +
            "\t\t\t\tSystem.out.println(\"Usage: CopyFile from to\");\n" +
            "\t\t\t\treturn;\n" +
            "\t\t\t}\n" +
            "// Copy a File.\n" +
            "\t\t\ttry {\n" +
            "\t\t\t\t// Attempt to open the files.\n" +
            "\t\t\t\tfin = new FileInputStream(args[0]);\n" +
            "\t\t\t\tfout = new FileOutputStream(args[1]);\n" +
            "\t\t\t\tdo {\n" +
            "\t\t\t\t\ti = fin.read();\n" +
            "\t\t\t\t\tif(i != -1) fout.write(i);\n" +
            "\t\t\t} while(i != -1);\n" +
            "\t\t\t} catch(IOException e) {\n" +
            "\t\t\t\tSystem.out.println(\"I/O Error: \" + e);\n" +
            "\t\t\t} finally {\n" +
            "\t\t\ttry {\n" +
            "\t\t\t\tif(fin != null) fin.close();\n" +
            "\t\t\t} catch(IOException e2) {\n" +
            "\t\t\t\tSystem.out.println(\"Error Closing Input File\");\n" +
            "\t\t\t}try {\n" +
            "\t\t\t\tif(fout != null) fout.close();\n" +
            "\t\t\t} catch(IOException e2) {\n" +
            "\t\t\t\tSystem.out.println(\"Error Closing Output File\");\n" +
            "\t\t\t}\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";

    public static void fileOutputStream(String dirFosName, String fileFosNAme) {
        String dirName = dirFosName;
        String fileName = fileFosNAme;


    }


    public static void main (String[] args) throws Exception {
        f.createDirectory(dirFosName);
        f.createFile(dirFosName, fileFosName);

    }

}
