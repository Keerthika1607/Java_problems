public class ReplaceSubstring {
   public static void main(String[] args) {
       String str = "I love apple. Apple is my favorite fruit.";
       
       // Replacing all occurrences of "apple" or "Apple" with "banana"
       String newStr = str.replaceAll("(?i)apple", "banana"); // or replace("apple", "banana")
       
       System.out.println("Original String: " + str);
       System.out.println("Modified String: " + newStr);
   }
}

