import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(100);

		System.out.println("Before");
		for (int i : arr)
			System.out.println(i);
		System.out.println();
		
		insertionSort(arr);
		
		System.out.println("After");
		for (int j : arr)
			System.out.println(j);
	}

	private static void insertionSort(int[] arr) {
		int currentValue = 0;
		for (int i = 1; i < arr.length; i++) {
			currentValue = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > currentValue) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentValue;
		}
	}
}
