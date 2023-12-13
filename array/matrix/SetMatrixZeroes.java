package arrays.matrix;

/**
 * @author yashw
 *	Given a matrix if an element in the matrix is 0 then you will have to set its 
 *	entire column and row to 0 and then return the matrix.
 *
 *	Examples 1:

	Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
	
	Output: [[1,0,1],[0,0,0],[1,0,1]]
	
	Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
	 
	Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
	
	Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
	
	Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
 */
public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		int[][] matrix2 = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		System.out.println("Matrix 1:");
		setZeroes(matrix1);
		printMatrix(matrix1);

		System.out.println("Matrix 2:");
		setZeroes(matrix2);
		printMatrix(matrix2);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		boolean[] zeroRow = new boolean[m];
		boolean[] zeroCol = new boolean[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					zeroRow[i] = true;
					zeroCol[j] = true;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			if (zeroRow[i]) {
				for (int j = 0; j < n; j++)
					matrix[i][j] = 0;
			}
		}

		for (int j = 0; j < n; j++) {
			if (zeroCol[j]) {
				for (int i = 0; i < m; i++)
					matrix[i][j] = 0;
			}
		}
	}
}
