/*

    Reverse bits of a given 32 bits unsigned integer.

    Note: 
        Note that in some languages, such as Java, there is no unsigned integer type. In this case
        both input and output will be given as a signed integer type. They should not affect your
        implementation, as the integer's internal binary representation is the same, 
        whether it is signed or unsigned.
        
        In Java, the compiler represents the signed integers using 2's complement notation. 
        Therefore, in Example 2 above, the input represents the signed integer -3 and 
        the output represents the signed integer -1073741825.
 

        Example 1:
        
        Input: n = 00000010100101000001111010011100
        Output:    964176192 (00111001011110000010100101000000)
        Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
        
        Example 2:
        
        Input: n = 11111111111111111111111111111101
        Output:   3221225471 (10111111111111111111111111111111)
        Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
        
        TC : O(1) , SC : O(1)
        
        Approach : The code takes an integer as input and reverses its binary representation by going through each bit from right to left. 
        It does this by creating a new number (the "result") and adding each bit to it in reverse order, effectively reversing the bits of the original number. 
        This process is repeated for all 32 bits, resulting in an integer with its bits reversed.
*/

public class ReverseBits{
    public static void main(String[] args) {
        int input = 43261596; // Example input
        int reversed = reverseBits(input);
        System.out.println("Reversed bits of " + input + " are: " + reversed);
    }
    
     public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
