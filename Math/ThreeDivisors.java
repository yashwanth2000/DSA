/* 
LeetCode Id : 1952

Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
An integer m is a divisor of n if there exists an integer k such that n = k * m.

Example 1:
Input: n = 2
Output: false
Explantion: 2 has only two divisors: 1 and 2.

Example 2:
Input: n = 4
Output: true
Explantion: 4 has three divisors: 1, 2, and 4.

Constraints:
1 <= n <= 104

TC : O(sqrt(n)) ,Sc: O(1)

Approach: The isThree function determines whether a given integer n has exactly three positive divisors. The approach involves iterating up to the square root of n and counting the number of divisors. 
Since divisors come in pairs, the count is incremented by 2 for each divisor found. After the loop, if n is a perfect square, one of its divisors has been counted twice, so the count is decremented by 1. 
Finally, the function returns true if the count is equal to 3 and false otherwise.

*/

public class ThreeDivisors {
    public static void main(String[] args) {
        // Test cases
        int number1 = 4;
        int number2 = 16;
        int number3 = 25;

        System.out.println(number1 + " is three? " + isThree(number1));
        System.out.println(number2 + " is three? " + isThree(number2));
        System.out.println(number3 + " is three? " + isThree(number3));
    }

    public static boolean isThree(int n) {
        // Time Complexity: O(sqrt(n))
        int sqrt_n = (int) Math.sqrt(n);
        int count = 0;

        for (int i = 1; i <= sqrt_n; i++) {
            if (n % i == 0) {
                count += 2;
            }
        }

        if (sqrt_n * sqrt_n == n) {
            count--;
        }

        return count == 3;
    }
}
