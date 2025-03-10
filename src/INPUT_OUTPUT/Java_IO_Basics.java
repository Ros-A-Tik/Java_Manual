package INPUT_OUTPUT;

import java.util.HashSet;

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

    public static void input_Stream() {

        HashSet <String> inputStream = new HashSet<String>();

        inputStream.add(input_Byte_Stream);
        inputStream.add(input_Character_Stream);

        System.out.println(input_streams + "\n\t" + input_streams_description + "\n\t" + input_Streams_Type);

        for(String i : inputStream) {
            System.out.println(i + ", ");
        }
    }

    public static void input_Byte_Stream() {

        HashSet <String> inputByteStreamClasses = new HashSet<String>();

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

        for(String i : inputByteStreamClasses) {
            System.out.println(i + ", ");
        }
    }

    public static void output_Stream() {

        HashSet <String> outputStream = new HashSet<String>();

        outputStream.add(output_Byte_Stream);
        outputStream.add(output_Character_Stream);

        System.out.println(output_streams + "\n\t" + output_streams_description + "\n\t" + output_Streams_Type);

        for(String i : outputStream) {
            System.out.println(i + ", ");
        }
    }


    public static void output_Byte_Stream() {

        HashSet <String> outputByteStreamClasses = new HashSet<String>();

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

        for(String i : outputByteStreamClasses) {
            System.out.println(i + ", ");
        }
    }

    public static void main (String[] args) {

        input_Stream();
        System.out.println();
        input_Byte_Stream();
        System.out.println();
        output_Stream();
        System.out.println();
        output_Byte_Stream();

    }
}