package TEXT_BLOCKS;

public class Java_TEXT_BLOCKS_Whitespace {
    public static String str_0 = """
            Text blocks support strings that
                span two or more lines and preserve
                    indentation. They reduce the
                        tedium associated with the
                            entry of long or complicated
                                strings into a program.
            """;
    public static String str_1 = """
            A
                B
                    C
            """;

    public static String str_2 = """
                A
                    B
                        C
            """;

    public static String str_3 = """
                    A
                        B
                            C
            """;

    public static String str_4 = """
                       A
                            B
                                C
            """;

    public static void main (String [] args) {
        System.out.println(str_0 + "\n" + str_1 + "\n" + str_2 + "\n" + str_3 + "\n" + str_4);
    }
}
