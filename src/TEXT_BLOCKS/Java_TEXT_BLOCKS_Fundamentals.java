package TEXT_BLOCKS;

public class Java_TEXT_BLOCKS_Fundamentals {

    static String textBlock;

    public static void main (String [] args) {
        textBlock = """
                My first text block on Java without any special separators.
                Hello Word and other words in English become more easy thant till nou.
                Thank you very much Java for this possibility.
                
                ..f.f.f.f.f.
                
                """;

        System.out.println(textBlock);

    }
}