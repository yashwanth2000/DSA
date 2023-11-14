package arrays.hard;

/**
 * @author yash Program to merge two sorted arrays and find the median of two
 *         sorted array.
 *
 */
public class Median2SortedArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 3};
		int arr2[] = { 2, 4};

		int[] mergedarr = merge(arr1, arr2);
		for(int i=0;i<mergedarr.length;i++)
			System.out.print(mergedarr[i]  + "\t");
		
		double median = findMedianSortedArrays(arr1,arr2);
		System.out.print("\n" + median);

	}

	//Method to merge
	private static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedarr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedarr[k] = arr1[i];
				i++;
			} else {
				mergedarr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			mergedarr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			mergedarr[k] = arr2[j];
			j++;
			k++;
		}
		return mergedarr;
	}
	
	//Method to find the median
	private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
		int mergedarr[] = merge(arr1, arr2);
		
		if(mergedarr.length % 2 == 1)
			return mergedarr[mergedarr.length/2];
		
		return ((double)mergedarr[mergedarr.length / 2] + (double) mergedarr[(mergedarr.length / 2) - 1]) / 2;
	}
	
}
