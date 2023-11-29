/*
 * 
Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).
What is an inversion of an array? Definition: for all i & j < size of array, if i < j 
then you have to find pair (A[i],A[j]) such that A[j] < A[i].


Example 1:
Input Format: N = 5, array[] = {1,2,3,4,5}
Result: 0
Explanation: we have a sorted array and the sorted array has 0 inversions as for i < j you will never
find a pair such that A[j] < A[i]. 
More clear example: 2 has index 1 and 5 has index 4 now 1 < 5 but 2 < 5 so this is not an inversion.

Example 2:
Input Format: N = 5, array[] = {5,4,3,2,1}
Result: 10
Explanation: we have a reverse sorted array and we will get the maximum inversions as for i < j we 
will always find a pair such that A[j] < A[i]. 
Example: 5 has index 0 and 3 has index 2 now (5,3) pair is inversion as 0 < 2 and 5 > 3 which will
satisfy out conditions and for reverse sorted array we will get maximum inversions and
that is (n)*(n-1) / 2.For above given array there is 4 + 3 + 2 + = 10 inversions.

Example 3:
Input Format: N = 5, array[] = {5,3,2,1,4}
Result: 7
Explanation: There are 7 pairs (5,1), (5,3), (5,2), (5,4),(3,2), (3,1), (2,1) 
and we have left 2 pairs (2,4) and (1,4) as both are not satisfy our condition.

TC :O(N*logN), where N = size of the given array. 
SC : O(N)

Approach: The approach involves a recursive merge-sort implementation. 
The mergeSort function divides the array into two halves and recursively sorts them, 
counting the inversions in each recursive call. 
The merge function is responsible for merging two sorted halves and counting the inversions during the merging process.
The count is updated when an element from the right half is smaller than an element from the left half, indicating an inversion. 
The count is increased by the number of remaining elements in the left half. This is because if an inversion occurs, 
all the remaining elements in the left half would also form inversions with the current element in the right half.

*/

class CountInversions {
	
    public static int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    public static int merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left, count = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                count += (mid - left + 1); // Update count for inversions
            }
        }

        while (i < leftSize) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightSize) {
            arr[k++] = rightArr[j++];
        }

        return count;
    }

    public static int numberOfInversions(int[] a, int n) {
        // Count the number of pairs:
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}
