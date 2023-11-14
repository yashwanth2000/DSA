package arrays.easy;
public class RemoveDuplicatesFromAnArray {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		int n = arr.length;
		int j=0;
		j = removeDuplicatesFromArray(arr, n);

		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static int removeDuplicatesFromArray(int[] arr, int n) {
		if (n == 0 || n == 1)
			return n;
		int j = 0;
		for (int i = 0; i < n-1; i++) {
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		}
		arr[j++] = arr[n - 1];
		return j;
	}
}
