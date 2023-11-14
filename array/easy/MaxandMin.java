package arrays.easy;

import java.util.Arrays;

public class MaxandMin {
	public static void main(String args[]) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = 6;
		getMinMax(arr, arr_size);

	}

	private static void getMinMax(int[] arr, int arr_size) {
		int min, max;
		
//		min = arr[0];
//		max = arr[1];
//		
//		for(int i=2;i<arr_size;i++) {
//			if(arr[i]>max)
//				max = arr[i];
//			else if (arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.print(min +" "+ max);

		Arrays.sort(arr);
		min = arr[0];
		max = arr[arr_size - 1];
		System.out.print(min + " " + max);
	}
}
