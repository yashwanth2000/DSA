/**
 * @author yashw 
           LeetCode Id : 493
 *
 *         Given an integer array nums, return the number of reverse pairs in
 *         the array.
 * 
 *         A reverse pair is a pair (i, j) where: 0 <= i < j < nums.length and
 *         nums[i] > 2 * nums[j].
 * 
 * 
 *         Example 1: Input: nums = [1,3,2,3,1] Output: 2 Explanation: The
 *         reverse pairs are: (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1 (3,
 *         4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
 * 
 *         Example 2: Input: nums = [2,4,3,5,1] Output: 3 Explanation: The
 *         reverse pairs are: (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1 (2,
 *         4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1 (3, 4) --> nums[3] = 5,
 *         nums[4] = 1, 5 > 2 * 1
 */
public class ReversePairs {

	public static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int left = low, right = mid + 1, index = 0;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[index++] = arr[left++];
			} else {
				temp[index++] = arr[right++];
			}
		}

		while (left <= mid) {
			temp[index++] = arr[left++];
		}

		while (right <= high) {
			temp[index++] = arr[right++];
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp[i - low];
		}
	}

	public static int countPairs(int[] arr, int low, int mid, int high) {
		int right = mid + 1, count = 0;

		for (int i = low; i <= mid; i++) {
			while (right <= high && arr[i] > 2L * arr[right]) {
				right++;
			}
			count += (right - (mid + 1));
		}

		return count;
	}

	public static int mergeSort(int[] arr, int low, int high) {
		int count = 0;

		if (low < high) {
			int mid = low + (high - low) / 2;
			count += mergeSort(arr, low, mid);
			count += mergeSort(arr, mid + 1, high);
			count += countPairs(arr, low, mid, high);
			merge(arr, low, mid, high);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 3, 1 };
		int cnt = reversePairs(a);
		System.out.println("The number of reverse pair is: " + cnt);
	}

	private static int reversePairs(int[] a) {
		return mergeSort(a, 0, a.length - 1);
	}
}
