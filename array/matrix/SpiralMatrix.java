package arrays.matrix;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yashw
 *	Given a Matrix, print the given matrix in spiral order.
 *
 *	Example 1:
	Input: Matrix[][] = { { 1, 2, 3, 4 },
			      { 5, 6, 7, 8 },
			      { 9, 10, 11, 12 },
		              { 13, 14, 15, 16 } }
	
	Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
	Explanation: The output of matrix in spiral form.
	
	Example 2:
	Input: Matrix[][] = { { 1, 2, 3 },
		              { 4, 5, 6 },
			      { 7, 8, 9 } }
				    
	Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
	Explanation: The output of matrix in spiral form.
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> ans = printSpiral(mat);

		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

		System.out.println();
	}

	private static List<Integer> printSpiral(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;

		int top = 0, bottom = n - 1, left = 0, right = m - 1;

		List<Integer> ans = new ArrayList<>();

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				ans.add(mat[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				ans.add(mat[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ans.add(mat[bottom][i]);
				}
			}

			bottom--;

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans.add(mat[i][left]);
				}
			}
			left++;
		}

		return ans;
	}

}
