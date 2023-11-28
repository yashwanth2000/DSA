/*
Leetcode Id : 28

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/

public class StrStrExample {
    public static void main(String[] args) {
        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Using indexOf - Needle found at index: " + strStr(haystack1, needle1));
        System.out.println("Without using indexOf - Needle found at index: " + strStrBruteForce(haystack1, needle1));

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Using indexOf - Needle found at index: " + strStr(haystack2, needle2));
        System.out.println("Without using indexOf - Needle found at index: " + strStrBruteForce(haystack2, needle2));

        String haystack3 = "mississippi";
        String needle3 = "issip";
        System.out.println("Using indexOf - Needle found at index: " + strStr(haystack3, needle3));
        System.out.println("Without using indexOf - Needle found at index: " + strStrBruteForce(haystack3, needle3));
    }

    public static int strStr(String haystack, String needle) {
        int firstOccurrence = haystack.indexOf(needle);
        return firstOccurrence;
    }

    public static int strStrBruteForce(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength == 0) return 0;

        for (int i = 0; i <= hLength - nLength; i++) {
            if (haystack.substring(i, i + nLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
