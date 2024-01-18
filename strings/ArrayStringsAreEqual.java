/* 
LeetCode Id: 1662

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 
Constraints:
1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.

TimeComplexity:O(n)

Approach: the arrayStringsAreEqual method compares two string arrays character by character without creating intermediate strings. 
It uses two indices (i and j) to navigate through the arrays and two additional indices (index1 and index2) to track the current character in each string. 
The method returns true if the arrays form equivalent strings and false otherwise.
*/

public class ArrayStringsAreEqual{
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = arrayStringsAreEqual(word1, word2);

        System.out.println("Are the string arrays equivalent? " + result);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0;
        int index1 = 0, index2 = 0;

        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(index1) != word2[j].charAt(index2)) {
                return false;
            }

            index1++;
            index2++;

            if (index1 == word1[i].length()) {
                index1 = 0;
                i++;
            }

            if (index2 == word2[j].length()) {
                index2 = 0;
                j++;
            }
        }

        return i == word1.length && j == word2.length;
    }
}
