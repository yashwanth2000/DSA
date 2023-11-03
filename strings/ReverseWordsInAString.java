/**
 * LeetCode Id : 557
 * 
 * @author yashw
 * Given a string s, reverse the order of characters in each word within a sentence 
 * while still preserving whitespace and initial word order.


	Example 1:
	Input: s = "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
	
	Example 2:
	Input: s = "God Ding"
	Output: "doG gniD"
	
	TC : O(n), SC : O(n)
	
	Approach : The code takes a sentence as input and reverses the characters within each word 
	while keeping the word order intact. It achieves this by splitting the sentence into individual words, 
	reversing each word, and then joining the reversed words to form the reversed sentence. 
	The final result is the input sentence with the words reversed.
 *
 */

public class ReverseWordsInSentence {

	public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

}
