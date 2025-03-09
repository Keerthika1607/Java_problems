public class Alphabet {
   public static void main(String[] args) {
      char ch = 'K';
      if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
         System.out.println(ch + " is an Alphabet");
      } else {
         System.out.println(ch + " is not an Alphabet");
      }
   }
}
