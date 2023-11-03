/**
 * LeetCode Id : 14
 * 
 * @author yashw
 *	Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".

 
	Example 1:
	Input: strs = ["flower","flow","flight"]
	Output: "fl"
	
	Example 2:
	Input: strs = ["dog","racecar","car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.
	
	TC : O(m * n), where m is the length of the longest string, and n is the number of strings.
	SC : O(m)
	
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"flower", "flour", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result); 
	}

	private static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";

        String firstPrefix = strs[0];
        //String lastPrefix = strs[0];

       for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(firstPrefix) != 0) {
                firstPrefix = firstPrefix.substring(0, firstPrefix.length() - 1);
            }
        }
        return firstPrefix;
	}
}
