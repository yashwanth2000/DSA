package arrays.medium;

/**
 * @author yash
 * it's also called as kadane's algorithm
 *	
 *	Given an integer array arr, find the contiguous subarray (containing at least one number) which
	has the largest sum and returns its sum and prints the subarray.
	
	Example 1:

	Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
	
	Output: 6 
	
	Explanation: [4,-1,2,1] has the largest sum = 6. 
	
	Examples 2: 
	
	Input: arr = [1] 
	
	Output: 1 
	
	Explanation: Array has only one element and which is giving positive sum of 1. 
 */

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = maxSubarraySum(arr);
		System.out.println("The maximum subarray sum is: " + maxSum);
	}

	private static int maxSubarraySum(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		int start = 0;
        int ansStart = -1, ansEnd = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			 if (sum == 0) start = i;
			
			sum += arr[i];

			if (sum > maxSum) {
				maxSum = sum;
				ansStart = start;
                ansEnd = i;
			}
				

			if (sum < 0)
				sum = 0;
		}
		
		System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
		
		
		// To consider the sum of the empty subarray
        //if (maxi < 0) maxi = 0;
		
		return maxSum;
	}

}
