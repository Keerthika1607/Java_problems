package BasicQuestions;

import java.util.Scanner;

public class StrongNumber {

   // Function to calculate factorial of a number
   public static int factorial(int n) {
      int fact = 1;
      for (int i = 1; i <= n; i++) {
         fact *= i;
      }
      return fact;
   }

   // Function to check if the number is a Strong Number
   public static boolean isStrongNumber(int num) {
      int originalNum = num;
      int sum = 0;

      while (num > 0) {
         int digit = num % 10; // Get the last digit
         sum += factorial(digit); // Add the factorial of the digit
         num /= 10; // Remove the last digit
      }

      return sum == originalNum; // Check if sum of factorials equals the original number
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Input number
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      // Check if the number is a Strong Number
      if (isStrongNumber(num)) {
         System.out.println(num + " is a Strong Number.");
      } else {
         System.out.println(num + " is not a Strong Number.");
      }

      sc.close();
   }
}
