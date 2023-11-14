package arrays.medium;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author yashw
 *	Given an array, print all the elements which are leaders. 
 *	A Leader is an element that is greater than all of the elements on its right side in the array.
 *
	 *	Example 1:
			Input:
			 arr = [4, 7, 1, 0]
			Output:
			 7 1 0
			Explanation:
			 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.
	
		Example 2:
			Input:
			 arr = [10, 22, 12, 3, 0, 6]
			Output:
			 22 12 6
			Explanation:
			 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), 
			 also 22 is greater than 12, 3, 0, 6.
 */
public class LeadersInAnArray {

	public static void main(String[] args) {
		int n = 6;
		  int arr[]=  {10, 22, 12, 3, 0, 6};


		  ArrayList<Integer> ans= printLeaders(arr,n);
		  
		  Collections.sort(ans, Collections.reverseOrder());
		  
		  for (int i = 0; i < ans.size(); i++)
		    System.out.print(ans.get(i)+" ");

	}

	private static ArrayList<Integer> printLeaders(int[] arr, int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		int max = arr[n-1];
		ans.add(arr[n-1]);
		
		for(int i = n-2;i>=0;i--) {
			if(arr[i] > max) {
				ans.add(arr[i]);
				max = arr[i];
			}
		}
		return ans;
	}

}
