/* 
  LeetCodde Id : 136
  
  @author yashw
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
  You must implement a solution with a linear runtime complexity and use only constant extra space.

  Example 1:
  Input: nums = [2,2,1]
  Output: 1
  
  Example 2:
  Input: nums = [4,1,2,1,2]
  Output: 4
  
  Example 3:
  Input: nums = [1]
  Output: 1

  TC : O(N), SC : O(1)
*/

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		int ans = getSingleElement(arr);
		System.out.println("The single element is: " + ans);
	}

	private static int getSingleElement(int[] arr) {
		int n = arr.length;
		int xor = 0;
		for (int i = 0; i < n; i++)
			xor = xor ^ arr[i];
		return xor;
	}
}
