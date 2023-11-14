package arrays.hard;

/**
 * @author yashw
 *	In this case, we are given the row number r and the column number c, 
 *	and we need to find out the element at position (r,c). 
 */
public class PascalTriangleThree {

	public static void main(String[] args) {
		int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }

	private static int pascalTriangle(int r, int c) {
		int element = (int) nCr(r - 1, c - 1);
        return element;
	}
	
	private static long nCr(int n, int r) {
		long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
	}
}
