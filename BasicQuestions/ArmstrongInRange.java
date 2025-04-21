package BasicQuestions;

import java.util.Scanner;

public class ArmstrongInRange {

   // Method to check if a number is Armstrong
   public static boolean isArmstrong(int num) {
      int original = num;
      int result = 0;
      int digits = String.valueOf(num).length();

      while (num > 0) {
         int digit = num % 10;
         result += Math.pow(digit, digits);
         num /= 10;
      }

      return result == original;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Get range from user
      System.out.print("Enter start of range: ");
      int start = sc.nextInt();
      System.out.print("Enter end of range: ");
      int end = sc.nextInt();

      System.out.println("Armstrong numbers between " + start + " and " + end + ":");

      // Loop through range and print Armstrong numbers
      for (int i = start; i <= end; i++) {
         if (isArmstrong(i)) {
            System.out.print(i + " ");
         }
      }

      sc.close();
   }
}
