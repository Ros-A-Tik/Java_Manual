package INPUT_OUTPUT;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.*;

public class Java_IO_Basics {
    //IO Streams
    public static String input_streams = "Input Stream";
    public static String input_streams_description = "Input Stream is a Stream which reads data.";
    public static String output_streams = "Output Stream";
    public static String output_streams_description = "Output Stream is a Stream which writes data.";

    //IO Type of Streams
    //IO Input Streams Types
    public static String input_Streams_Type = "The Input Stream Type are: ";
    public static String input_Byte_Stream = "\t\tInput Byte Stream";
    public static String input_Character_Stream = "\t\tInput Character Stream";
    //IO Output Streams Types
    public static String output_Streams_Type = "The Output Stream Type are: ";
    public static String output_Byte_Stream = "\t\tOutput Byte Stream";
    public static String output_Character_Stream = "\t\tOutput Character Stream";

    //IO Byte Streams Classes
    public static String input_Byte_Stream_Classes = "The Input Byte Classes are:";
    public static String output_Byte_Stream_Classes = "The Output Byte Classes are:";

    public static String bufferedInputStream = "\tBufferedInputStream";
    public static String bufferedOutputStream = "\tBufferedOutputStream";
    public static String byteArrayInputStream = "\tByteArrayInputStream";
    public static String byteArrayOutputStream = "\tByteArrayOutputStream";
    public static String dataInputStream = "\tDataInputStream";
    public static String dataOutputStream = "\tDataOutputStream";
    public static String fileInputStream = "\tFileInputStream";
    public static String fileOutputStream = "\tFileOutputStream";
    public static String filterInputStream = "\tFilterInputStream";
    public static String filterOutputStream = "\tFilterOutputStream";
    public static String inputStream = "\tInputStream";
    public static String outputStream = "\tOutputStream";
    public static String objectInputStream = "\tObjectInputStream";
    public static String objectOutputStream = "\tObjectOutputStream";
    public static String pipedInputStream = "\tPipedInputStream";
    public static String pipedOutputStream = "\tPipedOutputStream";
    public static String printStream = "\tPrintStream";
    public static String pushbackInputStream = "\tPushbackInputStream";
    public static String sequenceInputStream = "\tSequenceInputStream";

    //IO Character Stream Classes
    public static String readerCharacterStreamClasses = "The Input Character Classes are:";
    public static String writerCharacterStreamClasses = "The Output Character Classes are:";

    public static String bufferedReader = "\tBufferedReader";
    public static String bufferedWriter = "\tBufferedWriter";
    public static String charArrayReader = "\tCharArrayReader";
    public static String charArrayWriter = "\tCharArrayWriter";
    public static String fileReader = "\tFileReader";
    public static String fileWriter = "\tFileWriter";
    public static String inputStreamReader = "\tInputStreamReader";
    public static String lineNumberReader = "\tLineNumberReader";
    public static String outputStreamWriter = "\tOutputStreamWriter";
    public static String pipedReader = "\tPipedReader";
    public static String pipedWriter = "\tPipedWriter";
    public static String printWriter = "\tPrintWriter";
    public static String pushbackReader = "\tPushbackReader";
    public static String reader = "\tReader";
    public static String stringReader = "\tStringReader";
    public static String stringWriter = "\tStringWriter";
    public static String writer = "\tWriter";


    public static void input_Stream() {

        ArrayList inputStream = new ArrayList();

        inputStream.add(input_Byte_Stream);
        inputStream.add(input_Character_Stream);

        System.out.println(input_streams + "\n\t" + input_streams_description + "\n\t" + input_Streams_Type);

        Collections.sort(inputStream);

        for(Object i : inputStream) {
            System.out.println(i);
        }
    }

    public static void input_Byte_Stream() {

        ArrayList inputByteStreamClasses = new ArrayList();

        inputByteStreamClasses.add(bufferedInputStream);
        inputByteStreamClasses.add(byteArrayInputStream);
        inputByteStreamClasses.add(dataInputStream);
        inputByteStreamClasses.add(fileInputStream);
        inputByteStreamClasses.add(filterInputStream);
        inputByteStreamClasses.add(inputStream);
        inputByteStreamClasses.add(objectInputStream);
        inputByteStreamClasses.add(pipedInputStream);
        inputByteStreamClasses.add(pushbackInputStream);
        inputByteStreamClasses.add(sequenceInputStream);

        System.out.println(input_Byte_Stream_Classes);

        Collections.sort(inputByteStreamClasses);

        for(Object i : inputByteStreamClasses) {
            System.out.println(i);
        }
    }

    public static void output_Stream() {

        ArrayList outputStream = new ArrayList();

        outputStream.add(output_Byte_Stream);
        outputStream.add(output_Character_Stream);

        System.out.println(output_streams + "\n\t" + output_streams_description + "\n\t" + output_Streams_Type);

        Collections.sort(outputStream);

        for(Object i : outputStream) {
            System.out.println(i);
        }
    }

    public static void output_Byte_Stream() {

        ArrayList outputByteStreamClasses = new ArrayList();

        outputByteStreamClasses.add(bufferedOutputStream);
        outputByteStreamClasses.add(byteArrayOutputStream);
        outputByteStreamClasses.add(dataOutputStream);
        outputByteStreamClasses.add(fileOutputStream);
        outputByteStreamClasses.add(filterOutputStream);
        outputByteStreamClasses.add(outputStream);
        outputByteStreamClasses.add(objectOutputStream);
        outputByteStreamClasses.add(pipedOutputStream);
        outputByteStreamClasses.add(printStream);

        System.out.println(output_Byte_Stream_Classes);

        Collections.sort(outputByteStreamClasses);

        for(Object i : outputByteStreamClasses) {
            System.out.println(i);
        }
    }

    public static void reader_Character_Stream() {

        ArrayList reader_Character_Stream_Classes = new ArrayList();

        reader_Character_Stream_Classes.add(bufferedReader);
        reader_Character_Stream_Classes.add(charArrayReader);
        reader_Character_Stream_Classes.add(fileReader);
        reader_Character_Stream_Classes.add(inputStreamReader);
        reader_Character_Stream_Classes.add(lineNumberReader);
        reader_Character_Stream_Classes.add(pipedReader);
        reader_Character_Stream_Classes.add(pushbackReader);
        reader_Character_Stream_Classes.add(reader);
        reader_Character_Stream_Classes.add(stringReader);

        System.out.println(readerCharacterStreamClasses);

        Collections.sort(reader_Character_Stream_Classes);

        for (Object i : reader_Character_Stream_Classes) {
            System.out.println (i);
        }
    }

    public static void writer_Character_Stream() {

        ArrayList writer_Character_Stream_Classes = new ArrayList();

        writer_Character_Stream_Classes.add(bufferedWriter);
        writer_Character_Stream_Classes.add(charArrayWriter);
        writer_Character_Stream_Classes.add(fileWriter);
        writer_Character_Stream_Classes.add(outputStreamWriter);
        writer_Character_Stream_Classes.add(pipedWriter);
        writer_Character_Stream_Classes.add(printWriter);
        writer_Character_Stream_Classes.add(stringWriter);
        writer_Character_Stream_Classes.add(writer);

        System.out.println(writerCharacterStreamClasses);

        Collections.sort(writer_Character_Stream_Classes);

        for (Object i : writer_Character_Stream_Classes) {
            System.out.println (i);
        }
    }

    public static void main (String[] args) {

        input_Stream();
        System.out.println();
        input_Byte_Stream();
        System.out.println();
        reader_Character_Stream();
        System.out.println();
        output_Stream();
        System.out.println();
        output_Byte_Stream();
        System.out.println();
        writer_Character_Stream();

    }
}