// class GFG {
//    static void swapValuesUsingThirdVariable(int m, int n) {
//        int temp = m;
//        m = n;
//        n = temp;
//        System.out.println("Value of m is " + m + " and Value of n is " + n);
//    }

//    public static void main(String[] args) {
//        int m = 9, n = 5;
//        swapValuesUsingThirdVariable(m, n);
//    }
// }


public class GFG {
   public static void modify(int num) {
       num = 20; // Changing the value inside the method
       System.out.println(num);
   }

   public static void main(String[] args) {
       int x = 10;
       modify(x); // Passing value of x
       System.out.println("Value of x after method call: " + x); // x is still 10
   }
}

