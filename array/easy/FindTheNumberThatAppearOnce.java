package arrays.easy;

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
