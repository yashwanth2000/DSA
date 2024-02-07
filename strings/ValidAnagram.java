/* 
LeetCode Id : 242

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

*/

public class ValidAnagram {
    
    public static void main(String[] args) {
       
        System.out.println(isAnagram("listen", "silent")); // Output: true
        System.out.println(isAnagram("hello", "world"));   // Output: false
        System.out.println(isAnagram("hello", "hlelo"));   // Output: true
    }
    
   public static boolean isAnagram(String s, String t) {
        // Input validation
        if (s == null || t == null || s.length() != t.length())
            return false;

        // Convert strings to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Map to store counts of characters
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in the first string and decrement in the second string
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            charCount.put(c1, charCount.getOrDefault(c1, 0) + 1); // Increment count for character in s
            charCount.put(c2, charCount.getOrDefault(c2, 0) - 1); // Decrement count for character in t
        }

        // Check if all counts are zero
        for (int count : charCount.values()) {
            if (count != 0) 
                return false;
        }
        return true;
    }
}


/*
bruteforce
  public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
            
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++) 
            alphabet[s.charAt(i) - 'a']++;
        
        for (int i = 0; i < t.length(); i++) 
            alphabet[t.charAt(i) - 'a']--;
        
        for (int i : alphabet) {
            if (i != 0) 
                return false;
        }
        return true;
    }
*/
