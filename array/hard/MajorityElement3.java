package arrays.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yashw Given an integer array of size n, find all elements that appear
 *         more than ⌊ n/3 ⌋ times.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [3,2,3] Output: [3] Example 2:
 * 
 *         Input: nums = [1] Output: [1] Example 3:
 * 
 *         Input: nums = [1,2] Output: [1,2]
 *         
 *         Space Complexity = O(1), Time Complexity = 2n
 */
public class MajorityElement3 {

	public static void main(String[] args) {
		int[] arr = { 11, 33, 33, 11, 33, 11, 22, 22 };
		List<Integer> ans = majorityElement(arr);
		System.out.print("The majority elements are: ");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println();

	}

	private static List<Integer> majorityElement(int[] nums) {

		int n = nums.length;
		int cnt1 = 0, cnt2 = 0;
		int el1 = Integer.MIN_VALUE;
		int el2 = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (cnt1 == 0 && el2 != nums[i]) {
				cnt1 = 1;
				el1 = nums[i];
			}

			else if (cnt2 == 0 && el1 != nums[i]) {
				cnt2 = 1;
				el2 = nums[i];
			} else if (nums[i] == el1)
				cnt1++;
			else if (nums[i] == el2)
				cnt2++;
			else {
				cnt1--;
				cnt2--;
			}
		}

		List<Integer> ans = new ArrayList<>();
		cnt1 = 0;
		cnt2 = 0;
		for (int i = 0; i < n; i++) {
			if (el1 == nums[i])
				cnt1++;

			if (el2 == nums[i])
				cnt2++;
		}

		int min = n / 3 + 1;
		if (cnt1 >= min)
			ans.add(el1);
		if (cnt2 >= min)
			ans.add(el2);

		// Collections.sort(ans);

		return ans;
	}

}
