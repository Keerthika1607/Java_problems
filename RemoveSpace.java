public class RemoveSpace {
   public static void main(String[] args) {
      /* 
      String str = "Hello World Java Programming";
      StringBuilder s = new StringBuilder();

      for(char ch : str.toCharArray()) {
         if(ch != ' ' && ch != '\t') {
            s.append(ch);
         }
      }
      System.out.println(s);*/
      
      String str = "Hello World Java Programming";
      String[] s = str.split("[\\s]");
        
        for (String str1 : s) {
            System.out.print(str1);
        }
   }
}
