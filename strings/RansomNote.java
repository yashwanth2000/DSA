import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Id : 383
 * 
 * 	@author yashw
 *	Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine 
 *	and false otherwise.Each letter in magazine can only be used once in ransomNote.


	Example 1:
	Input: ransomNote = "a", magazine = "b"
	Output: false
	
	Example 2:
	Input: ransomNote = "aa", magazine = "ab"
	Output: false
	
	Example 3:
	Input: ransomNote = "aa", magazine = "aab"
	Output: true
	
	TC : O(r + m), where 'r' is the length of the ransom note, and 'm' is the length of the magazine.
	SC : O(c), where 'c' represents the number of unique characters in the magazine.
	
	Approach : The code checks if you can create a ransom note using characters from a magazine. 
	It does this by counting the frequency of each character in the magazine and 
	then checking if there are enough of each character to construct the ransom note. 
	If you have enough of each character, it returns "true"; otherwise, it returns "false." 
	The approach is optimized to run efficiently, even for large inputs, 
	by only iterating through both strings once to count the character frequencies.
	
	
 */
public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
	    Map<Character, Integer> charFrequency = new HashMap<>();

	    // Count character frequencies in the magazine
	    for (char c : magazine.toCharArray()) {
	        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
	    }

	    // Check if you can construct the ransom note
	    for (char c : ransomNote.toCharArray()) {
	        if (charFrequency.containsKey(c) && charFrequency.get(c) > 0) {
	            charFrequency.put(c, charFrequency.get(c) - 1);
	        } else {
	            return false; // Cannot construct the ransom note
	        }
	    }

	    return true;
	}

}
