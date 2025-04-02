public class ReverseString {
   public static void main(String[] args) {
      String str = "Prepinsta";
      StringBuilder reverse = new StringBuilder();

      reverse.append(str);
      System.out.println(reverse.reverse());
   }
}
