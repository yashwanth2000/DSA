/*
LeetCode : 75

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

TC : O(N), SC : O(1)

Approach : Using Dutch National Flag algorithm
The approach involves iterating through the array with the mid pointer. If the element at mid is 0, it swaps the elements at positions low and mid, 
increments both low and mid. If the element is 1, it increments only mid. If the element is 2, 
it swaps the elements at positions mid and high and decrements high. This process continues until mid crosses high.

*/

public class SortColors {
    public static void main(String[] args) {
        // Test case
        int[] colors = {2, 0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Original array: " + Arrays.toString(colors));
        sortColors(colors);
        System.out.println("Sorted array: " + Arrays.toString(colors));
    }

    public static void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
