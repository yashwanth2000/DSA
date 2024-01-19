/*
LeetCode Id: 1160

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

 

Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 

Constraints:
1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.

Time Complexity:O(N + K * M) ,Space Complexity: O(1)
Approach: The approach counts the frequency of characters in the chars string and then checks each word to see if it can be formed using the available counts.
It calculates the total length of words that can be formed.

*/
class WordFormation {
    public static int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];

        // Step 1: Count the frequency of each character in chars
        for (int i = 0; i < chars.length(); i++) {
            counts[chars.charAt(i) - 'a']++;
        }

        int totalLength = 0;

        // Step 3: Check each word in words
        for (String word : words) {
            if (canForm(word, counts)) {
                // Step 4: If the word can be formed, add its length to the total length
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    // Step 2: Check if a word can be formed using the available counts
    private boolean canForm(String word, int[] counts) {
        int[] wordCounts = new int[26];

        // Update counts for each character in the word
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            wordCounts[index]++;

            // Check if the counts exceed the available counts
            if (wordCounts[index] > counts[index]) {
                return false;
            }
        }

        return true;
    }

  public static void main(String[] args) {
    
        String[] words = {"cat", "bat", "hat", "tree"};
        String chars = "atach";

        int result = countCharacters(words, chars);

        System.out.println("Total length of words that can be formed: " + result);
    }
}
