// public class RemoveVowels {
//    public static void main(String[] args) {
//       String str = "Prepinsta";
//       String s = "";

//       s = str.replaceAll("[aeiou]", "");
//       System.out.println(s);
//    }
// }


import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        for (char ch : charArray) {
            // Check if the character is not a vowel
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }
        
        // Print the result
        System.out.println("String without vowels: " + result.toString());

        sc.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert character to lowercase for case-insensitive comparison
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
