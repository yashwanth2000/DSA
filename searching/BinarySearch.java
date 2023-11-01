/**
 *	Given an array of integers nums which is sorted in ascending order, 
 *	and an integer target, write a function to search target in nums. 
 *	If target exists, then return its index. Otherwise, return -1.
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
	}

	private static int binarySearch(int[] a, int target) {
		int low = 0, high = a.length - 1;

        if(low>high) return -1;

        while(low<=high) {
            int mid = low + (high-low) / 2;

            if(a[mid] == target) return mid;

            else if(target > a[mid]) low = mid + 1;

            else high = mid - 1;
        }
        return -1;
	}

}
