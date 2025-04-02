public class FirstNonRepeatingCharArray {
      public static void main(String[] args) {
          String str = "swiss";
          int[] freq = new int[256]; // Assuming ASCII characters
  
          for (char ch : str.toCharArray()) {
              freq[ch]++;
          }
  
          for (char ch : str.toCharArray()) {
              if (freq[ch] == 1) {
                  System.out.println("First Non-Repeating Character: " + ch);
                  return;
              }
          }
          
          System.out.println("No Non-Repeating Character Found");
      }
}
  

