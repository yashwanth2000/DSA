import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(100);

		System.out.println("Before");
		for (int i : arr)
			System.out.println(i);
		System.out.println();

		bubblesort(arr);

		System.out.println("After");
		for (int j : arr)
			System.out.println(j);
	}

	private static void bubblesort(int[] arr) {
		
		
		boolean swappesSomething = true;
		while (swappesSomething) {
			swappesSomething = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swappesSomething = true;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}
}
