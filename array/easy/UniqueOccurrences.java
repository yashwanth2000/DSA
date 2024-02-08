/* 
LeetCode Id : 1207

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:
Input: arr = [1,2]
Output: false

Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

Constraints:
1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000

TC : O(N), SC : O(N)
*/

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> numMap = new HashMap<>();
        
        // Count occurrences of each value in the array
        for (int i : arr) {
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        
        // Create a set containing the count of occurrences
        Set<Integer> numSet = new HashSet<>(numMap.values());
        
        // If the number of unique counts is the same as the number of unique numbers,
        // return true; otherwise, return false.
        return numMap.size() == numSet.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        
        System.out.println(uniqueOccurrences(arr1)); // Output: true
        System.out.println(uniqueOccurrences(arr2)); // Output: false
        System.out.println(uniqueOccurrences(arr3)); // Output: true
    }
}
