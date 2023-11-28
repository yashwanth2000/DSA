/*
LeetCode Id : 7 

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

TC : O(log(x))
SC : O(1)

Approach : The program reverses an integer by iteratively extracting its digits. It uses a while loop to repeatedly get the last digit and update the integer by removing that digit. 
To prevent overflow, it checks whether the reversed integer, before updating, stays within the limits of a 32-bit signed integer. 
If an overflow is detected, it returns 0; otherwise, it continues updating the reversed integer. The time complexity is logarithmic based on the number of digits, and the space complexity is constant.
*/

public class ReverseInteger {
    public static void main(String[] args) {
        // Test cases
        int num1 = 123;
        int num2 = -456;
        int num3 = 120;
        int num4 = 1534236469; // This case will result in overflow

        System.out.println("Original: " + num1 + ", Reversed: " + reverse(num1));
        System.out.println("Original: " + num2 + ", Reversed: " + reverse(num2));
        System.out.println("Original: " + num3 + ", Reversed: " + reverse(num3));
        System.out.println("Original: " + num4 + ", Reversed: " + reverse(num4));
    }

    public static int reverse(int x) {
        int reversedInt = 0;

        int temp = x;
        while (temp != 0) {
            int pop = temp % 10;
            temp = temp / 10;
            // Check for overflow before updating reversedInt
            if (reversedInt > Integer.MAX_VALUE / 10 || (reversedInt == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reversedInt < Integer.MIN_VALUE / 10 || (reversedInt == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            reversedInt = reversedInt * 10 + pop;

        }

        return reversedInt;
    }
}
