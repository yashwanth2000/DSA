package arrays.hard;

import java.util.HashMap;

public class LongestSubArrayWithZeroSum {

	public static void main(String[] args) {

		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n = arr.length;

		int maxLength = maxLen(arr, n);
		System.out.println("Maximum Length of Subarray with Zero Sum: " + maxLength);
	}

	private static int maxLen(int[] arr, int n) {
		int max = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			if (sum == 0)
				max = i + 1;
			else {
				if (map.get(sum) != null) {
					max = Math.max(max, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}
		}
		return max;
	}
}
