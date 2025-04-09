package GENERICS;

import INPUT_OUTPUT.*;


public class Java_GENERICS_Method_Search_InFile_Test {

    public static void main (String [] args) throws Exception {

        String dName = "D:\\JVAS\\MyFile";
        String fName = "My_First_File.txt";
        String txt = "Hello World!\n\t Rostislav.";
        String search = "stis";

        //Creating a directory and a text file with Java IO
        Java_IO_File f = new Java_IO_File();
        f.createDirectores(dName);
        f.createFile(dName, fName);

        //Writing a data in the file
        Java_IO_FileWriter fw = new Java_IO_FileWriter();
        fw.fileWriter(txt, dName + fName);

        //Read data form file
        Java_IO_FileReader fr = new Java_IO_FileReader();
        fr.fileReader(dName + fName);

    }
}
