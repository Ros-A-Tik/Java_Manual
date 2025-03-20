package INPUT_OUTPUT;

import java.io.FileInputStream;

public class Java_IO_FileInputStream_read {

    public static String dirName = "D:/FileInputStream";
    public static String fileName = "FileInputStream.txt";
    public static String textWrite = "/* Display a text file.\n" +
            "To use this program, specify the name\n" +
            "of the file that you want to see.\n" +
            "For example, to see a file called TEST.TXT,\n" +
            "use the following command line.\n" +
            "java ShowFile TEST.TXT\n" +
            "*/\n" +
            "import java.io.*;\n" +
            "class ShowFile {\n" +
            "public static void main(String[] args)\n" +
            "{\n" +
            "int i;\n" +
            "FileInputStream fin;\n" +
            "// First, confirm that a filename has been specified.\n" +
            "if(args.length != 1) {\n" +
            "System.out.println(\"Usage: ShowFile filename\");\n" +
            "return;\n" +
            "}\n" +
            "// Attempt to open the file.\n" +
            "try {\n" +
            "fin = new FileInputStream(args[0]);\n" +
            "} catch(FileNotFoundException e) {\n" +
            "System.out.println(\"Cannot Open File\");\n" +
            "return;\n" +
            "}\n" +
            "// At this point, the file is open and can be read.\n" +
            "// The following reads characters until EOF is encountered.\n" +
            "try {\n" +
            "do {\n" +
            "i = fin.read();\n" +
            "if(i != -1) System.out.print((char) i);\n" +
            "} while(i != -1);\n" +
            "} catch(IOException e) {\n" +
            "System.out.println(\"Error Reading File\");\n" +
            "}\n" +
            "// Close the file.\n" +
            "try {\n" +
            "fin.close();\n" +
            "} catch(IOException e) {\n" +
            "System.out.println(\"Error Closing File\");\n" +
            "}\n" +
            "}\n" +
            "}";

    public static Java_IO_File f = new Java_IO_File();
    public static Java_IO_FileWriter fw = new Java_IO_FileWriter();

    public static void fileInputStream (String dirName, String fileName) {
        int i;
        FileInputStream fis;

        try {
            fis = new FileInputStream(dirName + "\\" + fileName);
        }catch (Exception e) {
            System.out.println("Error! " + e);
            return;
        }

        try {
            do {
                i = fis.read();
                if ((i != -1)) {
                    System.out.print((char)i);
                }
            } while (i != -1);
        } catch (Exception e) {
            System.out.println("Error! " + e);
        }

        try {
            fis.close();
        } catch (Exception e) {
            System.out.println("Error! " +  e);
        }
    }

    public static void main (String[] args) throws Exception {

        f.createDirectory(dirName);
        f.createFile(dirName, fileName);
        fw.fileWriter(textWrite, dirName + "\\" + fileName);
        fileInputStream(dirName, fileName);

    }

}
