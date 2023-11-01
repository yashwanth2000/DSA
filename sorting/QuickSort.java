import java.util.Random;

public class Quicksort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(100);

		System.out.println("Before");
		for (int i : arr)
			System.out.println(i);
		System.out.println();

		quickSort(arr, 0, arr.length - 1);

		System.out.println("After");
		for (int j : arr)
			System.out.println(j);
	}

	private static void quickSort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex)
			return;

		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = arr[pivotIndex];
		swap(arr, pivotIndex, highIndex);

		int leftPointer = partition(arr, lowIndex, highIndex, pivot);

		quickSort(arr, lowIndex, leftPointer - 1);
		quickSort(arr, leftPointer + 1, highIndex);
	}

	private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer)
				leftPointer++;

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer)
				rightPointer--;

			swap(arr, leftPointer, rightPointer);
		}

		swap(arr, leftPointer, highIndex);

		if (arr[leftPointer] > arr[highIndex]) {
			swap(arr, leftPointer, highIndex);
		} else {
			leftPointer = highIndex;
		}
		return leftPointer;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}
}
