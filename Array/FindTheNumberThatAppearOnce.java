/**
 * @author yashw
 *	Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
 *
 *	Example 1:
	Input Format: arr[] = {2,2,1}
	Result: 1
	Explanation: In this array, only the element 1 appear once and so it is the answer.
	
	Example 2:
	Input Format: arr[] = {4,1,2,1,2}
	Result: 4
	Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

public class FindTheNumberThatAppearOnce {
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
