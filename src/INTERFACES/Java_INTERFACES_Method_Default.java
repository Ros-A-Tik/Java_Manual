package INTERFACES;

public interface Java_INTERFACES_Method_Default {

    int getNumber();

    default int getNumberDefault() {
        return 99;
    };

    String getString();

    default String getStringDefault() {
        return "Default String by Interface.";
    }

    static int getDefaultNumber() {
        return 0;
    }

}
