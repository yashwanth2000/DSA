/**
 * LeetCode Id : 3
 * 
 * @author yashw
 *	Given a string s, find the length of the longest substring
 	without repeating characters.

	Example 1:
	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	
	Example 2:
	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.

	Example 3:
	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	
	TC : O(N), SC : O(1)
	
	Approach : This code finds the length of the longest substring in a given string where all characters are unique. 
	It does this by moving two pointers through the string and adjusting them as needed to maintain a substring without repeated characters. 
	The code counts the length of these substrings and keeps track of the longest one it has found. 
	The final result is the length of the longest unique character substring. 
	The code goes through the string once, making its approach efficient, 
	and it uses a constant amount of additional memory.
	
 */
public class LongestSubStringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = new String();
		System.out.println("Enter the string");
		string = sc.next();

		int maxLength = lengthOfLongestSubstring(string);
		System.out.println(maxLength);

		sc.close();
	}

	private static int lengthOfLongestSubstring(String string) {
		int maxlength = 0;
		for (int right = 0, left = 0; right < string.length(); right++) {
			int indexOfFirstAppearenceinSubString = string.indexOf(string.charAt(right), left);

			if (indexOfFirstAppearenceinSubString != right)
				left = indexOfFirstAppearenceinSubString + 1;
				
			maxlength = Math.max(maxlength, right - left + 1);
		}
		return maxlength;
	}
}
