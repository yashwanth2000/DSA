import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(10);

		System.out.println("Before");
		for (int i : arr)
			System.out.println(i);
		System.out.println();

		selectionSort(arr);

		System.out.println("After");
		for (int j : arr)
			System.out.println(j);

	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
