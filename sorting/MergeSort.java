import java.util.Random;

public class MergeSort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(100);

		System.out.println("Before");
		for (int i : arr)
			System.out.println(i);
		System.out.println();

		mergesort(arr);

		System.out.println("After");
		for (int j : arr)
			System.out.println(j);
	}

	public static void mergesort(int[] arr) {
		int length = arr.length;
		
		if(length < 2) return;

		int midIndex = length / 2;
		int[] leftArr = new int[midIndex];
		int[] rightArr = new int[length - midIndex];

		for (int i = 0; i < midIndex; i++)
			leftArr[i] = arr[i];
		for (int i = midIndex; i < length; i++)
			rightArr[i-midIndex] = arr[i];

		mergesort(leftArr);
		mergesort(rightArr);

		merge(arr, leftArr, rightArr);
	}

	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int leftSize = leftArr.length;
		int rightSize = rightArr.length;
		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < leftSize) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < rightSize) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
