/*  
    LeetCode Id : 2433
    
    You are given an integer array pref of size n. 
    Find and return the array arr of size n that satisfies:

    pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
    Note that ^ denotes the bitwise-xor operation.
    
    It can be proven that the answer is unique.

    Example 1:
    Input: pref = [5,2,0,3,1]
    Output: [5,7,2,3,2]
    Explanation: From the array [5,7,2,3,2] we have the following:
    - pref[0] = 5.
    - pref[1] = 5 ^ 7 = 2.
    - pref[2] = 5 ^ 7 ^ 2 = 0.
    - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
    - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
    
    Example 2:
    Input: pref = [13]
    Output: [13]
    Explanation: We have pref[0] = arr[0] = 13.
    
    TC : O(N), SC : O(N)
    
    Approach : 
    Iterate over the array pref from the index N - 1 to 1 and 
    for each index i, do: pref[i] = pref[i] ^ pref[i - 1]
    We don't need to do anything for index 0 as it will be returned as it is.
    Return pref.
*/

class FindTheOriginalArrayofPrefixXor {
    public static void main(String[] args) {
        int[] pref = {1, 2, 3, 4, 5};
        int[] result = findArray(pref);

        System.out.println("Original Array:");
        printArray(pref);

        System.out.println("Modified Array:");
        printArray(result);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    
    public int[] findArray(int[] pref) {
        if(pref.length == 1) return pref;

         for (int i = pref.length - 1; i > 0; i--) {
            pref[i] = pref[i] ^ pref[i - 1];
        }
        return pref;
    }
    /* 
     brute force
    int[] result = new int[pref.length];
        result[0] = pref[0];
 
    for(int i=1;i<pref.length;i++){
            result[i] = pref[i] ^ pref[i-1];
    } 
    */
}
