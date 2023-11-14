package arrays.easy;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] a = {2,3,5};
        long k = 5;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
	}

	private static int getLongestSubarray(int[] a, long k) {
		int n = a.length;
		int len = 0;
		for(int i =0;i<n;i++) {
			long s = 0;
			for(int j = i;j<n;j++) {
				s+=a[j];
				
				if(s == k)
					len = Math.max(len, j - i +1);
					
			}
		}
		return len;
	}

}