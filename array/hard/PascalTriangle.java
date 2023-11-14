package arrays.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yashw
 *	Variation 1: Given the number of rows n. Print the first n rows of Pascal’s triangle.
 */
public class PascalTriangle {

	public static void main(String[] args) {
		int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
	}

	private static List<List<Integer>> pascalTriangle(int n) {
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int row=1;row<=n;row++) {
			ans.add(generateRow(row));
		}
		
		return ans;
	}

	private static List<Integer> generateRow(int row) {
		long ans = 1;
		List<Integer> ansRow = new ArrayList<>();
		ansRow.add(1);
		
		for(int col = 1;col<row;col++) {
			ans = ans * (row - col);
			ans = ans / col;
			ansRow.add((int)ans);
		}
		
		return ansRow;
	}

}
