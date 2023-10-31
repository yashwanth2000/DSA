package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yashw
 *	Given an array, we have found the number of occurrences of each element in the array.
 *
 *	Example 1:
	Input: arr[] = {10,5,10,15,10,5};
	Output: 10  3
		 5  2
	        15  1
	Explanation: 10 occurs 3 times in the array
		      5 occurs 2 times in the array
	              15 occurs 1 time in the array
	
	
	Example2: 
	Input: arr[] = {2,2,3,4,4,2};
	Output: 2  3
		3  1
	        4  2
	Explanation: 2 occurs 3 times in the array
		     3 occurs 1 time in the array
	             4 occurs 2 time in the array
 */
public class CountFrequency {

	public static void main(String[] args) {
		int arr[] = {10,5,10,15,10,5};
	     Frequency(arr);
	}

	private static void Frequency(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i =0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else 
				map.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " +  entry.getValue());
		}
	}

}
