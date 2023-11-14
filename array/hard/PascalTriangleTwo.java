package arrays.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yashw
 *	Given the row number n. Print the n-th row of Pascal’s triangle.
 */
public class PascalTriangleTwo {
	public static void main(String[] args) {
		int rowIndex = 5;
		List<Integer> result = getRow(rowIndex);
		System.out.println("Pascal's Triangle Row " + rowIndex + ": " + result);
	}

	private static List<Integer> getRow(int rowIndex) {
		long ans = 1;
		
		List<Integer> ansRow = new ArrayList<>();
		ansRow.add(1);
		
		for(int col=1;col<=rowIndex;col++) {
			ans = ans *(rowIndex - col + 1) ;
			ans = ans / col;
			ansRow.add((int)ans);
		}
		
		return ansRow;
	}
}
