package arrays.medium;

/**
 * @author yashw
 *Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */
public class MoveAllZerosToTheEndOfTheArray {
	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        int[] ans = moveZeros( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
	}

	private static int[] moveZeros(int[] arr) {
		int n = arr.length;
		
		int j = -1;
		for(int i = 0;i<n;i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		
		if(j==-1) return arr;
		
		for(int i = j+1;i<n;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		return arr;
	}
}
