package strings;

import java.util.HashMap;

/**
 * @author yashw
 *	Function Description

	Complete the function matchingStrings in the editor below. The function must return an array of integers 
	representing the frequency of occurrence of each query string in strings.matchingStrings has the following parameters:

	string strings[n] - an array of strings to search
	string queries[q] - an array of query strings
	
	Returns
	
	int[q]: an array of results for each query
	Input Format
	
	The first line contains and integer , the size of .
	Each of the next  lines contains a string .
	The next line contains , the size of .
	Each of the next  lines contains a string .
 */
public class StringOccurenceCount {

	public static void main(String[] args) {
		String[] strings = {"abc", "def", "abc", "pqr", "abc"};
        String[] queries = {"abc", "def", "xyz"};
        
        int[] results = matchingStrings(strings, queries);

        for (int result : results) {
            System.out.println(result);
        }
	}

	private static int[] matchingStrings(String[] strings, String[] queries) {
		HashMap<String, Integer> freqMap = new HashMap<>();
		
		for(String str : strings) {
			freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
		}
		
		int[] results = new int[queries.length];
		for(int i=0;i<results.length;i++) {
			String query = queries[i];
			results[i] = freqMap.getOrDefault(query,0);
		}
		
		return results;
	}

}
