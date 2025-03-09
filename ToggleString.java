// public class ToggleString {
//    public static void main(String[] args) {
//       String s = "PrePinSTa";
//       StringBuilder toggledString = new StringBuilder();

//       for(char ch : s.toCharArray()) {
//          if(Character.isUpperCase(ch)) {
//             toggledString.append(Character.toLowerCase(ch));
//          } else {
//             toggledString.append(Character.toUpperCase(ch));
//          }
//       }
//       System.out.println(toggledString.toString()); 
//    }
// }


public class ToggleString {
   public static void main(String[] args) {
      String s = "PrePinSTa";
      char[] toggledArray = s.toCharArray(); // Convert string to char array

      for (int i = 0; i < toggledArray.length; i++) {
         if (Character.isUpperCase(toggledArray[i])) {
            toggledArray[i] = Character.toLowerCase(toggledArray[i]);
         } else {
            toggledArray[i] = Character.toUpperCase(toggledArray[i]);
         }
      }

      System.out.println(new String(toggledArray)); 
   }
}

