public class RemoveChar {
   public static void main(String[] args) {
      /* 
      String s = "hel1456lo56wor%^ld";
      s=s.replaceAll("[^a-zA-Z]","");
      System.out.println(s);
      */
      /* 
      String s = "hel1456lo56wor%^ld";
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
      */

        String s = "hel1456lo56wor%^ld";
        String result = "";

        for (char ch : s.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                result += ch; // Concatenating only letters
            }
        }

        System.out.println(result);
   }
}
