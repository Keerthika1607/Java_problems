import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String : ");
      String str = sc.nextLine();

      str = str.toLowerCase();

      HashMap<Character, Integer> frequencyMap = new HashMap<>();

      for(char ch : str.toCharArray()) {
         if(ch != ' ') {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
         }
      }
      System.out.println("Character Frequency : ");
      for(char ch : frequencyMap.keySet()){
         System.out.println(ch + " " + ":" + " " + frequencyMap.get(ch));
      }
   }
}
