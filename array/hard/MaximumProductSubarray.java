/* 
LeetCode Id : 152 

Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 
Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

TC : O(N) ,SC : O(1)

Approach : The given method maxProduct calculates the maximum product of a subarray within the input array nums. 
It uses two variables, prefix and suffix, to keep track of the product of elements encountered so far from the beginning and the end of the array, respectively. 
The algorithm iterates through the array, updating the prefix and suffix product at each step and keeping track of the maximum product encountered. 
The approach efficiently handles cases involving positive and negative integers.
*/

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum Product: " + result);
    }
    public int maxProduct(int[] nums) {
          int prefix = 1, suffix = 1;
          int ans = Integer.MIN_VALUE;
          int n = nums.length;
  
          for(int i=0;i<n;i++){
              if(prefix == 0) prefix = 1;
              if(suffix == 0) suffix = 1;
  
             prefix *= nums[i];
              suffix *= nums[n - i - 1];
              ans = Math.max(ans,Math.max(prefix,suffix));
          }
  
          return ans;
      }
}
