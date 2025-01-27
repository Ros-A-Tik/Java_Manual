package EXCEPTION_HANDLING;

public class Java_EXCEPTION_Built_in {
    public static String javaLang = "Exception of \"java.lang\" are:";
    public static String runtimeException_Unchecked = "2) Unchecked RuntimeException are:" +
            "\n\tArithmeticException\t-\tArithmetic error, such as divide-by-zero." +
            "\n\tArrayIndexOutOfBoundsException\t-\tArray index out-of-bounds." +
            "\n\tArrayStoreException\t-\tAssignment to an array element of an incompatible type." +
            "\n\tClassCastException\t-\tInvalid acst." +
            "\n\tEnumConstantNotPresentException\t-\tAn attempt is made to use an undefined enumeration value." +
            "\n\tIllegalArgumentException\t-\tIllegal argument used to invoke a method." +
            "\n\tIllegalCallerException\t-\tA method cannot be legally executed by the calling code." +
            "\n\tIllegalMonitorStateException\t-\tIllegal monitor operation, such as such as waiting on an unlocked thread." +
            "\n\tIllegalStateException\t-\tEnvironment or application is in incorrect state." +
            "\n\tIllegalThreadStateException\t-\tRequest operation not compatible with current thread state." +
            "\n\tIndexOutOfBoundsException\t-\tSome type of index is out-of-bounds." +
            "\n\tLayerInstantiationException\t-\tA module layer cannot be created." +
            "\n\tNegativeArraySizeException\t-\tArray created with a negative size." +
            "\n\tNullPointerException\t-\tInvalid use of null reference." +
            "\n\tNumberFormatException\t-\tInvalid conversion of the string to a numeric format." +
            "\n\tSecurityException\t-\tAttempt to violate security." +
            "\n\tStringIndexOutOfBounds\t-\tAttempt to index outside the bounds of a string." +
            "\n\tTypeNotPresentException\t-\tType not found." +
            "\n\tUnsupportedOperationalException\t-\tAn unsupported operation was uncounted.";

    public static String runtimeException_Checked = "1) Checked RuntimeException are:" +
            "\n\tClassNotFoundException\t-\tClass not found." +
            "\n\tCloneNotSupportedException\t-\tAttempt to clone an object that does not implement the Cloneable interface." +
            "\n\tIllegalAccessException\t-\tAccess to the class is denied." +
            "\n\tInstantiationException\t-\tAttempt to create an object of an abstract class or interface." +
            "\n\tInterruptedException\t-\tOne thread has been interrupted by another thread." +
            "\n\tNoSuchFieldException\t-\tA requested field does not exist." +
            "\n\tNoSuchMethodException\t-\tA requested method does not exist." +
            "\n\tReflectiveOperationException\t-\tSuperclass of reflection-related exception.";

    public static void main (String[] args) {
        System.out.println(javaLang);
        System.out.println();
        System.out.println(runtimeException_Checked);
        System.out.println();
        System.out.println(runtimeException_Unchecked);
    }
}
