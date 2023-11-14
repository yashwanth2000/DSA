package arrays.easy;

/**
 * @author yashw Example 1: Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 ,
 *         right Output: 6 7 1 2 3 4 5 Explanation: array is rotated to right by
 *         2 position .
 * 
 *         Example 2: Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
 *         Output: 9 10 11 3 7 8 Explanation: Array is rotated to right by 3
 *         position.
 */
public class RotateArrayLeftOrRightByKElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 7;
		int k = 3;
		
//		rotateRight(arr, n, k);
//		System.out.print("After Rotating the k elements to right ");
//		for (int i = 0; i < n; i++)
//			System.out.print(arr[i] + " ");
//		System.out.println();
		
		rotateLeft(arr, n, k);
		System.out.print("After Rotating the k elements to left ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void rotateLeft(int[] arr, int n, int k) {
		if (n < 2)
			return;

		k = k % n;

		if (k > n)
			return;

		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);

	}

	private static void rotateRight(int[] arr, int n, int k) {
		if (n < 2)
			return;

		k = k % n;

		if (k > n)
			return;
		reverse(arr, 0, n - k - 1);

		reverse(arr, n - k, n - 1);

		reverse(arr, 0, n - 1);

	}

	static void reverse(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
