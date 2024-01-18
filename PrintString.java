/**
 * Print the concatenation of two strings.
 */
public class PrintString
{
    /**
     * Print the first two arguments as a string.
     * @param args The command line arguments.
     */
    public static void main(String[] args)
    {
        String word1 = args[0];
        String word2 = args[1];
        String word3 = args[2];
        String allWords = word1 + " " + word2 + " " + word3;
        System.out.println(allWords);
    }
}


