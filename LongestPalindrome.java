public class LongestPalindrome {
   public static boolean isPalindrome(int num) {
      String str = Integer.toString(num);
      String reverseString = new StringBuilder(str).reverse().toString();
      return str.equals(reverseString);
   }
   
   public static int longestPalindrome(int[] arr) {
      int palindromeResult = -1;

      for(int num : arr) {
         if(isPalindrome(num)) {
            if(num > palindromeResult) {
               palindromeResult = num;
            }
         }
      }
      return palindromeResult;
   }
   public static void main(String[] args) {
      int[] arr = {121, 12321, 123, 989, 45654, 1234, 22};
      int result = longestPalindrome(arr);
      if(result == -1) {
         System.out.println("No Palindrome found");
      } else {
         System.out.println(result + " : " + "it is a longest palindrome");
      }
   }
}

/*
 * public class LongestPalindromeNumber {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to find the longest palindromic number in an array
    public static int longestPalindrome(int[] arr) {
        int longestPalindrome = -1;

        for (int num : arr) {
            if (isPalindrome(num)) {
                
                if (num > longestPalindrome) {
                    longestPalindrome = num;
                }
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        int[] arr = {121, 12321, 123, 989, 45654, 1234, 22};
        
        int result = longestPalindrome(arr);
        if (result == -1) {
            System.out.println("No palindrome found in the array.");
        } else {
            System.out.println("Longest Palindromic Number: " + result);
        }
    }
}
 */

/*
 * public class LongestPalindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to find the longest palindrome in an array
    public static String longestPalindrome(String[] arr) {
        String longestPalindrome = "";
        
        for (String word : arr) {
            if (isPalindrome(word)) {
                if (word.length() > longestPalindrome.length()) {
                    longestPalindrome = word;
                }
            }
        }

        return longestPalindrome.isEmpty() ? "No palindrome found" : longestPalindrome;
    }

    public static void main(String[] args) {
        String[] arr = {"madam", "racecar", "apple", "banana", "rotator", "civic"};
        
        String result = longestPalindrome(arr);
        System.out.println("Longest Palindrome: " + result);
    }
}

 */

 
