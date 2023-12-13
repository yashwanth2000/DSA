package arrays.matrix;

/**
 * @author yashw
 *	Given a arr, your task is to rotate the arr 90 degrees clockwise.
 *
 *	Example 1:

	Input: [[1,2,3],[4,5,6],[7,8,9]]
	
	Output: [[7,4,1],[8,5,2],[9,6,3]]
	
	Explanation: Rotate the arr simply by 90 degree clockwise and return the arr.
	
	Example 2:
	
	Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
	
	Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
	
	Explanation: Rotate the arr simply by 90 degree clockwise and return the arr
 */
public class RotateImage {
	public static void main(String[] args) {
		int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateCw(arr);
        System.out.println();
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotateAcw(arr1);
        
	}

	private static void rotateAcw(int[][] arr1) {
		
		int n = arr1.length;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i;j<arr1[0].length;j++) {
				int temp = 0;
				 temp = arr1[i][j];
				 arr1[i][j] = arr1[j][i];
				 arr1[j][i] = temp;
			}
		}
		
		int ind = n-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp = arr1[j][i];
                arr1[j][i] = arr1[ind][i];
                arr1[ind][i] = temp;
                ind--;
            }
            ind = n-1;
        }
        
        System.out.println("Rotate Image ACW");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
		
	}

	private static void rotateCw(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[0].length;j++) {
				int temp = 0;
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
			}
		}
		
		System.out.println("Rotated Image CW");
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

}
