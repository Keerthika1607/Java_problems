package BasicQuestions;

import java.util.Scanner;

public class PrimeinRange {

   // Function to check if a number is prime
   public static boolean isPrime(int n) {
      if (n <= 1)
         return false;
      if (n == 2)
         return true;
      if (n % 2 == 0)
         return false;

      for (int i = 3; i <= Math.sqrt(n); i += 2) {
         if (n % i == 0)
            return false;
      }

      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Get the range from the user
      System.out.print("Enter start of range: ");
      int start = sc.nextInt();
      System.out.print("Enter end of range: ");
      int end = sc.nextInt();

      System.out.println("Prime numbers between " + start + " and " + end + " are:");

      // Loop through the range and print primes
      for (int i = start; i <= end; i++) {
         if (isPrime(i)) {
            System.out.print(i + " ");
         }
      }

      sc.close();
   }
}
