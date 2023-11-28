/* 
LeetCode Id : 268

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 
Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

TC : O(N) , Sc : O(1)

Approach : The missingNumber function uses the concept of the sum of natural numbers to find the missing number in an array of consecutive integers with one element missing. 
The expected sum of the sequence from 0 to n is calculated using the formula (n * (n + 1)) / 2. 
Then, the actual sum of the elements in the array is calculated by iterating through the array. The difference between the expected sum and the actual sum is the missing number, which is then returned.
*/

public class MissingNumberExample {
    public static void main(String[] args) {
        // Test case
        int[] nums = {3, 0, 1};
        System.out.println("Original array: " + Arrays.toString(nums));
        int missingNumber = missingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
