package arrays.medium;



import java.util.HashSet;
import java.util.Set;

/**
 * @author yashw
 *	You are given an array of ‘N’ integers. You need to find the length of the 
 *	longest sequence which contains the consecutive elements.
 *
 *	Example 1:

	Input: [100, 200, 1, 3, 2, 4]
	
	Output: 4
	
	Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.
	
	Input: [3, 8, 5, 7, 6]
	
	Output: 4
	
	Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
	}

	private static int longestSuccessiveElements(int[] a) {
		int n = a.length;
		if(n == 0)
			return 0;
		int longest = 1;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++)
			set.add(a[i]);
		
		for(int i : set) {
			if(!set.contains(i - 1)) {
				int x = i;
				int cnt =1;
				
				while(set.contains(x+1)) {
					x = x + 1;
					cnt++;
				}
				longest = Math.max(longest, cnt);
			}
		}
		
		return longest;
	}

}
