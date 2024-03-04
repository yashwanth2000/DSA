/* 
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9

TC: O(n^2), SC: O(1)

Approach: First, we initialize two variables to keep track of the sums of elements along the two main diagonals of the matrix.
Then, we iterate through each element of the matrix using nested loops.
For each element, if its row index is equal to its column index, it belongs to the first diagonal, so we add it to the sum of the first diagonal.
Similarly, if the sum of the row index and column index is equal to n - 1 (where n is the size of the matrix), 
it belongs to the second diagonal, so we add it to the sum of the second diagonal.
Finally, we return the absolute difference between the two sums as the diagonal difference of the matrix.
*/

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        
        // Sample input array
        arr.add(new ArrayList<>(List.of(1, 2, 3)));
        arr.add(new ArrayList<>(List.of(4, 5, 6)));
        arr.add(new ArrayList<>(List.of(7, 8, 9)));
        
        int result = diagonalDifference(arr);
        System.out.println("Diagonal difference: " + result);
    }
    
    public static int diagonalDifference(List<List<Integer>> arr) {
        int a = 0, b = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    a += arr.get(i).get(j);
                }
                if ((i + j) == (arr.size() - 1)) {
                    b += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(a - b);
    }
}

/* 
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal Difference: " + diagonalDifference(arr));
    }
    
    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int a = 0, b = 0;
        
        for (int i = 0; i < n; i++) {
            a += arr[i][i]; // Sum of elements on the main diagonal
            b += arr[i][n - 1 - i]; // Sum of elements on the secondary diagonal
        }
        return Math.abs(a - b); 
    }
}
*/
