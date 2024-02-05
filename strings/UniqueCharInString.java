/* 
LeetCode Id : 387 

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 
Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.

TC : O(N),SC : O(1)

Approach : The method iterates through each alphabet from 'a' to 'z'. For each alphabet, it finds the first and last occurrences in the input string. 
If they are the same, it means that the character occurs only once in the string. The method keeps track of the minimum index of such characters found during the iteration.

*/

public class UniqueCharInString {
    public static void main(String[] args) {
        String example1 = "leetcode";
        int result1 = firstUniqChar(example1);
        System.out.println("Example 1: " + result1);  // Output: 0

        String example2 = "loveleetcode";
        int result2 = firstUniqChar(example2);
        System.out.println("Example 2: " + result2);  // Output: 2

        String example3 = "aabb";
        int result3 = firstUniqChar(example3);
        System.out.println("Example 3: " + result3);  // Output: -1
    }

    public static int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);

            if (index != -1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

//Using HashMap
/* 
public int firstUniqChar(String s) {
        HashMap<Character,Integer> count   = new HashMap<Character,Integer>();

        for(int i=0;i< s.length();i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
  }
*/
