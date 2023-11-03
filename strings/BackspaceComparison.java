/*		
    LeetCode Id : 844

 		@author yashw
	 	Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
	 	'#' means a backspace character.
		Note that after backspacing an empty text, the text will continue empty.

		Example 1:
		Input: s = "ab#c", t = "ad#c"
		Output: true
		Explanation: Both s and t become "ac".
		
		Example 2:
		Input: s = "ab##", t = "c#d#"
		Output: true
		Explanation: Both s and t become "".
		
		Example 3:
		Input: s = "a#c", t = "b"
		Output: false
		Explanation: s becomes "c" while t becomes "b".
		
		TC : O(m + n), where 'm' and 'n' are the lengths of the two input strings.
		SC : O(max(m, n))
 */

public class BackspaceComparison {
	 public static void main(String[] args) {
	        String s1 = "ab#c";
	        String t1 = "ad#c";
	        System.out.println("Input: s = " + s1 + ", t = " + t1);
	        boolean result1 = backspaceCompare(s1, t1);
	        System.out.println("Output: " + result1);
	        System.out.println();

	        String s2 = "ab##";
	        String t2 = "c#d#";
	        System.out.println("Input: s = " + s2 + ", t = " + t2);
	        boolean result2 = backspaceCompare(s2, t2);
	        System.out.println("Output: " + result2);
	        System.out.println();

	        String s3 = "a#c";
	        String t3 = "b";
	        System.out.println("Input: s = " + s3 + ", t = " + t3);
	        boolean result3 = backspaceCompare(s3, t3);
	        System.out.println("Output: " + result3);
	    }

	    public static boolean backspaceCompare(String s, String t) {
	    	String processedS = processBackSpaces(s);
	        String processedT = processBackSpaces(t);

	        return processedS.equals(processedT);
	    }

		private static String processBackSpaces(String input) {
			StringBuilder result = new StringBuilder();

	        for(char c : input.toCharArray()){
	            if(c != '#') result.append(c);

	            else if(result.length() > 0) 
	            	result.deleteCharAt(result.length() - 1);
	        }

	        return result.toString();
		}	    
}
