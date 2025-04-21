import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueElementsFinder {
   public static List <Integer> findUnique(int[] arr) {
      HashMap <Integer, Integer> map = new HashMap<>();

      for(int num : arr) {
         map.put(num, map.getOrDefault(num, 0) + 1);
      }

      List <Integer> unique = new ArrayList<>();

      for(int num : arr) {
         if(map.get(num) == 1) {
            unique.add(num);
         }
      }
      return unique;
   }

   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 6, 7, 3, 4, 5, 7};
      List <Integer> result = findUnique(arr);
      
      if (result.isEmpty()) {
         System.out.println("null");
      } else {
         System.out.println("Unique elements: " + result);
      }
   }
}
