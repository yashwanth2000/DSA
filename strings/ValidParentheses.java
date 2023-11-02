/*
    @author yashw
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
    determine if the input string is valid.

    An input string is valid if:
    
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     

    Example 1:
    
    Input: s = "()"
    Output: true
    
    Example 2:
    Input: s = "()[]{}"
    Output: true
    
    Example 3:
    Input: s = "(]"
    Output: false

    TC : O(n), SC : O(1) in best case, O(n) in worst case.
    Approach : The code uses a stack-like array to validate expressions with parentheses, curly braces, and square brackets. 
    It checks for an odd length (an immediate invalidity indicator), maintains an array to simulate the stack, and iterates through the characters. 
    When encountering an opening bracket, it adds it to the stack. When finding a closing bracket, 
    it compares it to the last opened bracket and returns false if they don't match or if there are unmatched closing brackets. 
    If it successfully processes the entire string and the stack is empty, it returns true. The approach has a time complexity of O(n) due to linear string processing.
    
*/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String s = "{[()]}";
        System.out.println(solution.isValid(s)); // Output: true
    }
    
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[top++] = c;
            } else {
                if (top == 0) return false;
                top--;

                char topChar = stack[top];
                if ((c == ')' && topChar != '(') || (c == ']' && topChar != '[') || (c == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        return top == 0;
    }
}

/*  
        Using Stack builin data Structue.
        
        public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Matched a pair of parentheses
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Matched a pair of curly braces
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Matched a pair of square brackets
            } else {
                return false; // Invalid character or mismatched brackets
            }
        }
        
        return stack.isEmpty(); // If the stack is empty, all brackets are matched.
    }
    */
