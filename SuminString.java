public class SuminString {
   public static void main(String[] args) {
      String numString = "4PREP2INSTAA6";
      int sum = 0;
      
      for(char ch : numString.toCharArray()) {
         if(ch >= '0' && ch <= '9') {
            sum += (ch - '0');
         }
      }
      System.out.println(sum);
   }
}
