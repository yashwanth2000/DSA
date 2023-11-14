package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yashw Given an integer array nums, return all the triplets [nums[i],
 *         nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] +
 *         nums[j] + nums[k] == 0. Notice that the solution set must not contain
 *         duplicate triplets.
 *
 *         Example 1:
 * 
 *         Input: nums = [-1,0,1,2,-1,-4]
 * 
 *         Output: [[-1,-1,2],[-1,0,1]]
 * 
 *         Explanation: Out of all possible unique triplets possible, [-1,-1,2]
 *         and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k
 * 
 *         Example 2:
 * 
 *         Input: nums=[-1,0,1,0] Output: Output: [[-1,0,1],[-1,1,0]]
 *         Explanation: Out of all possible unique triplets possible, [-1,0,1]
 *         and [-1,1,0] satisfy the condition of summing up to zero with i!=j!=k
 * 
 * 
 *         Approach : Using two pointers algorithm and sort the array first.
 * 
 *         Time Complexity: O(NlogN)+O(N2), where N = size of the array.
 * 
 *         Space Complexity: O(1)
 */

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> ans = triplet(arr);
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (Integer i : it) {
				System.out.print(i + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}

	private static List<List<Integer>> triplet(int[] arr) {
		int n = arr.length;

		List<List<Integer>> ans = new ArrayList<>();

		Arrays.sort(arr);

		for (int i = 0; i < n - 2; i++) {
			// If the current element at i is positive,
			// then there is no possibility of finding a triplet with a sum of zero,
			// because the array is sorted. In such cases, you can break out of the loop.
			if (arr[i] > 0) {
				break;
			}
			if (i != 0 && arr[i] == arr[i - 1])
				continue;
			int j = i + 1;
			int k = n - 1;

			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
					j++;
					k--;
					// skip for the duplicates
					while (j < k && arr[j] == arr[j - 1])
						j++;
					while (j < k && arr[k] == arr[k + 1])
						k--;
				}
			}
		}
		return ans;
	}

}
