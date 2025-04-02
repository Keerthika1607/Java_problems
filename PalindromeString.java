public class PalindromeString {
   public static void main(String[] args) {
      String str = "LEVEL";
      String reverse = "";

      for(char ch : str.toCharArray()) {
         reverse = reverse + ch;
      }
      if(reverse.equals(str)) {
         System.out.println("Palindrome");
      } else {
         System.out.println("Not a Palindrome");
      }
   }
}
