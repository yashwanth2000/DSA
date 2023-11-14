package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yashw Given an array nums of n integers, return an array of all the
 *         unique quadruplets [nums[a], nums[b], nums[c], nums[d]]
 *
 *         Example 1:
 * 
 *         Input: nums = [1,0,-1,0,-2,2], target = 0 Output:
 *         [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] Example 2:
 * 
 *         Input: nums = [2,2,2,2,2], target = 8 Output: [[2,2,2,2]]
 */
public class FourSum {

	public static void main(String[] args) {
		int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
		List<List<Integer>> ans = fourSum(nums, target);
		System.out.println("The quadruplets are: ");
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (int ele : it) {
				System.out.print(ele + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		
		int n = nums.length;
		
		if (n < 4) {
			return result; // There are not enough elements for a 4Sum
		}
		
		Arrays.sort(nums);
		
		if (n == 4 && nums[0] + nums[1] + nums[2] + nums[3] == target) {
			result.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
		    return result;
        }

		for (int i = 0; i < n; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < n; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int k = j + 1;
				int l = n - 1;
				while (k < l) {
					long sum = nums[i] + nums[j] + nums[k] + nums[l];
					if (sum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
						while (k < l && nums[k] == nums[k - 1])
							k++;
						while (k < l && nums[l] == nums[l + 1])
							l--;
					} else if (sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		return result;
	}
}
