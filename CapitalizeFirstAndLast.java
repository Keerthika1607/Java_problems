import java.util.Scanner;

public class CapitalizeFirstAndLast {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String : ");
      String str = sc.nextLine();

      String[] s = str.split("\\s+");
      StringBuilder result = new StringBuilder();

      for(String word : s) {
         if(word.length() == 1) {
            result.append(Character.toUpperCase(word.charAt(0))).append(" ");
         } else {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1, word.length() - 1)).append(Character.toUpperCase(word.charAt(word.length() - 1))).append(" ");
         }
      }
      System.out.println(result);
   }
}
