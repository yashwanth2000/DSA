import java.util.Scanner;

/**
 * @author yash
 *	You will be given a list of 32 bit unsigned integers. Flip all the bits (0 -> 1 and 1 -> 0 ) 
 *	and return the result as an unsigned integer.
 */
public class FlippingBit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to flip : ");
		long num = scanner.nextLong();
		
		long flippingBit = ~num;
		//System.out.println(flippingBit);
		
		flippingBit &= 0xFFFFFFFFL;
		System.out.println(flippingBit);
		
		scanner.close();
	}

}
