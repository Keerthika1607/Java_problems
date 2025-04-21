package BasicQuestions;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;

        // Eliminate even numbers
        if (n % 2 == 0)
            return false;

        // Check odd numbers up to √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 37;

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
