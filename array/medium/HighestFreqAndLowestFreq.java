package arrays.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yashw Given an array of size N. Find the highest and lowest frequency
 *         element. Example 1: Input: array[] = {10,5,10,15,10,5}; Output: 10 15
 *         Explanation: The frequency of 10 is 3, i.e. the highest and the
 *         frequency of 15 is 1 i.e. the lowest.
 * 
 *         Example 2:
 * 
 *         Input: array[] = {2,2,3,4,4,2}; Output: 2 3 Explanation: The
 *         frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1
 *         i.e. the lowest.
 */
public class HighestFreqAndLowestFreq {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 10, 15, 10, 5 };
		highFreqAndLowFreq(arr);
	}

	private static void highFreqAndLowFreq(int[] arr) {
		Map<Integer, Integer> countFreq = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (countFreq.containsKey(arr[i]))
				countFreq.put(arr[i], countFreq.get(arr[i]) + 1);
			else
				countFreq.put(arr[i], 1);
		}

		int maxFreq = 0;
		int minFreq = arr.length;
		int maxEle = 0;
		int minEle = 0;

		for (Map.Entry<Integer, Integer> entry : countFreq.entrySet()) {
			int count = entry.getValue();
			int element = entry.getKey();

			if (count > maxFreq) {
				maxEle = element;
				maxFreq = count;
			}
			if (count < minFreq) {
				minEle = element;
				minFreq = count;
			}
		}

		System.out.println("The highest frequency element is: " + maxEle);
		System.out.println("The lowest frequency element is: " + minEle);
	}
}
