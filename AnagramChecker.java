import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] frequency = new int[256]; // Array to store frequencies of ASCII characters
        
        // Count frequencies for str1 and decrement for str2
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;    // Increase count for each character in str1
            frequency[str2.charAt(i)]--;    // Decrease count for each character in str2
        }
        
        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) { // If any character has a non-zero count, return false
                return false;
            }
        }
        
        return true; // All counts are zero, so strings are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        sc.close();
    }
}
/*
 * import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheckerUsingMap {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count characters in str1
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Decrease count for characters in str2
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) { // If a character is not in the map, return false
                return false;
            }
            map.put(c, map.get(c) - 1); // Decrease the count
            
            if (map.get(c) == 0) { // Remove character if count reaches 0
                map.remove(c);
            }
        }
        
        return map.isEmpty(); // If map is empty, they are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        sc.close();
    }
}

 */


 /*
  * 

  import java.util.Scanner;
public class CheckIfTwoStringsAreAnagramAreNot {
    static boolean isAnagram(String str1 , String str2) {
    String s1 = str1.replaceAll("[\\s]", "");
    String s2 = str2.replaceAll("[\\s]", "");
    boolean status=true;

     if(s1.length()!=s2.length())
         status = false;
     else {
         char[] a1 = s1.toLowerCase().toCharArray();
         char[] a2 = s2.toLowerCase().toCharArray();
         Arrays.sort(a1);
         Arrays.sort(a2);
         status = Arrays.equals(a1, a2);
       }
       return status;
} 
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter two String :");
     String s1 = sc.next();
     String s2 = sc.next();
     boolean status = isAnagram(s1,s2);
       if(status)
          System.out.println(s1+" and "+s2+" are Anagram");
       else 
          System.out.println(s1+" and "+s2+" are not Anagram");
       }
}
  */