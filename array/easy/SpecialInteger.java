/* 
LeetCode Id: 1287

Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1
 
Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 105

TC : O(N),SC : O(1)
Approach: The approach of the code is to iterate through the sorted array, keeping track of the current element and its frequency (currFreq). 
The code increments the frequency when the current element is equal to the previous one and resets it to 1 otherwise. 
If the frequency exceeds the minimum required frequency (minFreq), it returns the current element. 
The final return statement ensures that if the last element is part of the answer, it is returned directly.

*/
public class SpecialInteger{
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println("Example 1 Output: " + findSpecialInteger(arr1));

        // Example 2
        int[] arr2 = {1, 1};
        System.out.println("Example 2 Output: " + findSpecialInteger(arr2));
    }
  public int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int minFreq = size / 4;
        int currFreq = 1;

        int currElement = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {

            if ( currElement == arr[i]) currFreq++;
            else currFreq = 1;
            
            if (currFreq > minFreq) return arr[i];
            
            currElement = arr[i];
        }

        return currElement;
    }
}
