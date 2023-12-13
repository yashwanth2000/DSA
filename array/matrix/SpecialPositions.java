/* 
LeetCode Id: 1582

Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
 
Example 1:
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Example 2:
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 
Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 100
mat[i][j] is either 0 or 1.

TC: O(M * N), SC: O(1)

Approach: The numSpecial method checks each row of the matrix to find a unique '1', and if found, it ensures that this '1' is the only '1' in its column. 
The code increments the specials count for each special position found.
*/

public class SpecialPositions {
    public static void main(String[] args) {
        // Example usage
        SpecialPositions sp = new SpecialPositions();

        // Creating a binary matrix
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 1},
            {1, 0, 0}
        };

        // Calling the numSpecial method to find the number of special positions
        int specialCount = sp.numSpecial(matrix);

        // Printing the result
        System.out.println("Number of special positions: " + specialCount);
    }
  public int numSpecial(int[][] mat) {

        int specials = 0;

        for (int i = 0; i < mat.length; i++) {
            int index = checkRow(mat, i);
            if (index >= 0 && checkColumn(mat, i, index))
                specials++;
        }

        return specials;
    }

    private int checkRow(int[][] mat, int i) {
        int index = -1;
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] == 1) {
                if (index >= 0)
                    return -1;
                else
                    index = j;
            }
        }
        return index;
    }

    private boolean checkColumn(int[][] mat, int i, int index) {
        for (int j = 0; j < mat.length; j++) {
            if (mat[j][index] == 1 && j != i)
                return false;
        }
        return true;
    }
}

/* 
Bruteforce
bruteforce
public int numSpecial(int[][] mat) {
        int special = 0,col[] = new int[mat[0].length], row[] = new int[mat.length];;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    
                    col[j]++;
                    row[i]++;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) 
            for (int j = 0; j < mat[0].length; j++) 
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) special++;
        return special;
*/
