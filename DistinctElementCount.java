import java.util.HashSet;

public class DistinctElementCount {
   public static int countDistinct(int[] arr) {
      HashSet <Integer> distinctElement = new HashSet<>();

      for(int num : arr) {
         distinctElement.add(num);
      }

      return distinctElement.size();
   }
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 2, 4, 1, 7, 5, 6, 6, 7, 3};
      int result = countDistinct(arr);
      System.out.println(result);
   }
}
