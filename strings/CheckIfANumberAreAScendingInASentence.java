/* 
LeetCode Id : 2042

A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, 
or a word consisting of lowercase English letters.

For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right 
(i.e., other than the last number, each number is strictly smaller than the number on its right in s).
Return true if so, or false otherwise.


Example 1:
Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
Output: true
Explanation: The numbers in s are: 1, 3, 4, 6, 12.
They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.

Example 2:
Input: s = "hello world 5 x 5"
Output: false
Explanation: The numbers in s are: 5, 5. They are not strictly increasing.

Example 3:
Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
Output: false
Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.
 
Constraints:

3 <= s.length <= 200
s consists of lowercase English letters, spaces, and digits from 0 to 9, inclusive.
The number of tokens in s is between 2 and 100, inclusive.
The tokens in s are separated by a single space.
There are at least two numbers in s.
Each number in s is a positive number less than 100, with no leading zeros.
s contains no leading or trailing spaces.


TC : O(N) ,SC : O(1)

Approach: The areNumbersAscending function checks whether the numbers in a given string are in ascending order. 
It first splits the input string into tokens using space as a delimiter. Then, it iterates through each token, checking if it represents a positive integer. 
If so, it converts the token to an integer and compares it with the previous number. If the current number is less than or equal to the previous number, 
the function returns false indicating that the numbers are not in ascending order. Otherwise, it updates the previous number and continues the iteration. If no violation is found, the function returns true.
*/

public class AreNumbersAscending {
    public static void main(String[] args) {
        // Test cases
        String str1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String str2 = "hello world 5 x 5";
        String str3 = "1 2 3 4 5";

        System.out.println("Are numbers in ascending order? " + areNumbersAscending(str1));
        System.out.println("Are numbers in ascending order? " + areNumbersAscending(str2));
        System.out.println("Are numbers in ascending order? " + areNumbersAscending(str3));
    }

    public static boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        int prevNumber = Integer.MIN_VALUE;

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                int currentNumber = Integer.parseInt(token);

                if (currentNumber <= prevNumber) {
                    return false;
                }

                prevNumber = currentNumber;
            }
        }
        return true;
    }
}
