/* 
  LeetCode Id : 1356
  
  @author yashw
  You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation 
  and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

  Return the array after sorting it.

Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]

Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.

*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortIntegersbyTheNumberof1Bits{

    public static void main(String[] args) {
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

        int[] result = sortByBits(arr);

        System.out.println("Sorted Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

     public int[] sortByBits(int[] arr) {
        Integer[] data = new Integer[arr.length];
        for(int i=0; i<arr.length; i++)
            data[i] = arr[i];
        
        Arrays.sort(data, (a,b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if(bitsA == bitsB)
                return a - b;
            else
                return bitsA - bitsB;
        });

        for(int i=0; i<arr.length; i++)
            arr[i] = data[i];

        return arr;
    }

   /*
    private int countBits(int num) {
        int count = 0;
        while(num != 0) {
            num &= (num-1);
            count++;
        }

        return count;
    }
    */
}
