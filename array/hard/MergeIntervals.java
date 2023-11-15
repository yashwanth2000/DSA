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
	
	Approach : The provided code merges overlapping intervals within a given array of intervals. 
	 It first sorts the intervals based on their starting times. Then, it iterates through the sorted intervals, 
	 merging overlapping ones and adding non-overlapping ones to a new list. The key idea is to compare each interval with the last merged interval; 
	 if there's an overlap, the intervals are merged by updating the end time, otherwise, the current interval is added to the merged list. 
	 This process results in a list of non-overlapping intervals covering the entire input set. 
  	The time complexity is influenced by the sorting step, making it O(n log n), where n is the number of intervals, 
   	and the space complexity is O(n) due to the additional space needed to store the merged intervals.
		
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
		if (intervals == null || intervals.length <= 1) {
            		return intervals;
        	}

	        // Sort intervals based on start times
	        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

	        List<int[]> merged = new ArrayList<>();
	        merged.add(intervals[0]);
	
	        for (int i = 1; i < intervals.length; i++) {
	            int[] current = intervals[i];
	            int[] previous = merged.get(merged.size() - 1);
	
	            // Check for overlap
	            if (current[0] <= previous[1]) {
	                // Merge intervals
	                previous[1] = Math.max(current[1], previous[1]);
	            } else {
	                // No overlap, add current interval to the merged list
	                merged.add(current);
	            }
	        }
	
	        return merged.toArray(new int[merged.size()][]);
	}

}
