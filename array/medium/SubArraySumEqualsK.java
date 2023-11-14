package arrays.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yashw
 *	Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.
	A subarray is a contiguous non-empty sequence of elements within an array.
	
	Example 1:
	Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
	Result: 2
	Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
	
	Example 2:
	Input Format: N = 3, array[] = {1,2,3}, k = 3
	Result: 2
	Explanation: The subarrays that sum up to 3 are [1, 2], and [3].
	 */
public class SubArraySumEqualsK {

	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
	}

	private static int findAllSubarraysWithGivenSum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int prefixSum = 0, cnt = 0;
		map.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			prefixSum += arr[i];
			
			int remove = prefixSum - k;
			
			cnt += map.getOrDefault(remove, 0);
			
			map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
		}
		return cnt;
	}

}
