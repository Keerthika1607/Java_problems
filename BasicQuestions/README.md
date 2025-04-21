 - To Find Sum Of Natural Numbers - (n*(n+1)/2) -> This is a formula.

 - Range to find sum of numbers(12 to 15) - (num2*(num2+1)/2 - num1*(num1+1)/2 + num1) -> This is a formula.

 - 📌 Let’s take a number:
Suppose we want to check if n = 36 is prime.

We know:

36 = 1 × 36

36 = 2 × 18

36 = 3 × 12

36 = 4 × 9

36 = 6 × 6

36 = 9 × 4

36 = 12 × 3

36 = 18 × 2

36 = 36 × 1

Look closely 👀 — see how after 6 × 6, the factors start repeating in reverse.

✨ What is √n?
√36 = 6

After 6, all the factors are already checked (but in reverse).

So, if we don’t find any factor up to √n, it means:

There is no factor pair like a × b = n
(where both a and b are greater than √n)
→ Because if a > √n, then b < √n, so we already checked it!

✅ Final Logic:
For any number n:

If n has a factor other than 1 and itself, then at least one of the factors must be ≤ √n.

So, we only need to check from 2 to √n.

If no number divides n in that range, then: 👉 n is prime!

🔢 Example: Check if 29 is prime
√29 ≈ 5.38 → check up to 5

Try dividing by 2, 3, 4, 5

None of them divide 29 → So 29 is prime ✅

 - In Armstrong Number -> int digits = String.valueOf(num).length();
   - String.valueOf(num) -> converts number to string value (876 -> "876").length() -> it finds the length of the digit so 3 will store in digits variable.