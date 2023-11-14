package arrays.easy;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7,7,6, 5};
		int n = arr.length;
			int sS = secondSmallest(arr, n);
			int sL = secondLargest(arr, n);
		System.out.println("Second smallest is "+sS);
		System.out.println("Second largest is "+sL);
	
	}

	private static int secondLargest(int[] arr, int n) {
		
		if(n < 2) return -1;
		
		int large = Integer.MIN_VALUE;
		int secondlarge = Integer.MIN_VALUE;
		
		for(int i = 0;i<n;i++) {
			if(arr[i] > large) {
				secondlarge = large;
				large = arr[i];
			} else if(arr[i] > secondlarge && arr[i] != large) {
				secondlarge = arr[i];
			}
		}
		return secondlarge;
	}

	private static int secondSmallest(int[] arr, int n) {
		int small = Integer.MAX_VALUE;
		int secondsmall = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i] < small) {
				secondsmall = small;
				small = arr[i];
			} else if (arr[i] < secondsmall && arr[i] != small) {
				secondsmall = arr[i];
			}
		}
		
		return secondsmall;
	}
}
