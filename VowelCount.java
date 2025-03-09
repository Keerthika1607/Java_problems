public class VowelCount {
   public static void main(String[] args) {
      String s = "Prepinsta";
      int vowel = 0;

      for(char ch : s.toCharArray()) {
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            vowel++;
         }
      }
      System.out.println(vowel);
   }
}
