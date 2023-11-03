import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Id: 22
 * @author yashw
 *	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

	Example 1:
	Input: n = 3
	Output: ["((()))","(()())","(())()","()(())","()()()"]
	
	Example 2:
	Input: n = 1
	Output: ["()"]
	
	TC : O(2^(2n)), SC : O(N)
	
	Approach: This code generates all valid combinations of parentheses with a given number, 'n', 
	by using a recursive approach. It starts with an empty string and keeps adding open 
	and closed parentheses while ensuring that the parentheses remain balanced. 
	It uses a depth-first recursive function to explore all possible combinations. 
	When it reaches a valid combination with the desired length, it adds it to the result list.
 */


public class GenerateParentheses {

	public static void main(String[] args) {
		int n = 1;
        List<String> combinations = generateParenthesis(n);
        for (String combination : combinations) {
            System.out.println(combination);
        }

	}

	private static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
	}

	private static void generate(List<String> result, String current, int open, int close, int max) {
		if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generate(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            generate(result, current + ")", open, close + 1, max);
        }
	}

}
