package arrays.easy;


public class MaximumSubarray {
	

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println("MAX SubArray " + maxSubArrSum(a));
	}

	private static int maxSubArrSum(int[] a) {
		int maxSum = a[0];
		int currentSum = a[0];
		
		for(int i = 1;i<a.length;i++) {
			if(a[i] > currentSum)
				currentSum += a[i];
				
			else
				currentSum += a[i];
			
			if(currentSum > maxSum)
				maxSum = currentSum;
			
//			for (int i = 1; i < a.length; i++) {
//		       
//		        currentSum = Math.max(a[i], currentSum + a[i]);
//		        
//		       
//		        maxSum = Math.max(maxSum, currentSum);
//		    }
		}
		
		return maxSum;
	}
}
