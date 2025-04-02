public
class Main {
    static void remove(String str, String word) {
        String msg[] = str.split(" ");
        String new_str = "";

        // Iterating the string using for each loop
        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {
                // Concat the word not equal to the given word
                new_str += words + " ";
            }
        }
        // Print the new String
        System.out.print(new_str);
    }
    public
    static void main(String[] args) {
        // Custom string as input
        String str = "This is the prepinsta";
        // Word to be removed from above string
        String word = "the";
        // Calling the method 1 by passing both strings to it
        remove(str, word);
    }
}


/*
 * 
 * public class Main
{
 public static void main(String[] args)
    {

        // Given String as input from which
        // word has to be removed
        String str = "This is the prepinsta";

        // Desired word to be removed
        String word = "the";
        // Replace all words by "" string
        // using replaceAll() method
        str = str.replaceAll("the", "");

        // Trim the string using trim() method
        str = str.trim();

        // Printing the final string
        System.out.print(str);
    }
}
 */
