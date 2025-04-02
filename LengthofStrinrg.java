public class LengthofStrinrg {
   public static void main(String[] args) {
      int length = 0;
      String s = "Prepinsta";

      for (char ch : s.toCharArray()) {
         length++;
      }
      System.out.print(length);
   }
}
