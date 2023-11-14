package arrays.hard;

import java.util.Arrays;
/**
 * LeetCode Id : 56
 * @author yashw
 * 
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

	Example 1:
	Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
	Output: [[1,6],[8,10],[15,18]]
	Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
	
	Example 2:

	Input: intervals = [[1,4],[4,5]]
	Output: [[1,5]]
	Explanation: Intervals [1,4] and [4,5] are considered overlapping.
	
	TC : O(NLOGN) for sorting an array and O(N) for loop
	SC : O(N)
	
	Approach : the code takes a set of time intervals, like appointments, 
	and combines overlapping appointments into single blocks of time. 
	This way, you get a list of non-overlapping time slots representing when you're available. 
	The code does this by sorting the intervals, comparing them, and merging overlapping ones. 
	Finally, it returns a list of these merged time slots.
	
 *
 */
public class MergeIntervals {

	public static void main(String[] args) {
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
	}

	private static int[][] merge(int[][] intervals) {
		//Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
		
		int[][] result = new int[intervals.length][2];
		int count = 0;
		
		for(int i=0;i<intervals.length;i++) {
			if(count == 0 || intervals[i][0] > result[count - 1][1]) {
				result[count][0] = intervals[i][1];
				count++;
			}
			else {
				result[count - 1][i] = Math.max(result[count - 1][1], intervals[i][1]);
			}
		}
		
		return Arrays.copyOf(result, count);
	}

}
