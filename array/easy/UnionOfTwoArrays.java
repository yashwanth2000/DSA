package arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArrays {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		  ArrayList<Integer> Union = findUnion(arr1, arr2);
		  System.out.println("Union of arr1 and arr2 is ");
		  for (int val: Union)
		    System.out.print(val+" ");
	}

	private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> union = new ArrayList<>();
		
		for(int i = 0;i<m;i++) set.add(arr1[i]);
		
		for(int j = 0;j<n;j++) set.add(arr2[j]);
		
		for(int i : set) union.add(i);
		
 		return union;
	}
}
