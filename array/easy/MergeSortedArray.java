/*
LeetCode Id : 88

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 

Follow up: Can you come up with an algorithm that runs in O(m + n) time?

TC : O(m+n), SC : O(1)
*/

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        // Example arrays
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        // Create an instance of your class (assuming the merge method is in a class)
        MergeArraysExample merger = new MergeArraysExample();

        // Call the merge method
        merger.merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int num1Copy[] = Arrays.copyOf(nums1,m);

        int i=0, j=0,k=0;

        while(i<m && j<n){
            if(num1Copy[i] < nums2[j]){
                nums1[k++] = num1Copy[i++];
            }
            else{
                nums1[k++] = nums2[j++];
            }
        }
        while(i<m){
            nums1[k++] = num1Copy[i++];
        }
        while(j<n){
            nums1[k++] = nums2[j++];
        }
    }
}



/* 
Extra : without using copy array
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1; // Index for the end of nums1
    int j = n - 1; // Index for the end of nums2
    int k = m + n - 1; // Index for the end of the merged array

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    // Copy remaining elements from nums2, if any
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
}
*/
