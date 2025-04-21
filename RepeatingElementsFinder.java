import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatingElementsFinder {

    public static List<Integer> findRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> repeating = new ArrayList<>();

        // Count occurrences of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find elements with count > 1 (repeating elements)
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                repeating.add(num);
            }
        }
        
        return repeating;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 6, 7, 3, 4, 5, 7};
        List<Integer> result = findRepeating(arr);

        if (result.isEmpty()) {
         System.out.println("null");
      } else {
         System.out.println("Unique elements: " + result);
      }
    }
}

