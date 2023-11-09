package basicMath;
import java.util.Scanner;

/**
 * @author yashw
 *	
Given a binary number, find the given binary number is divisible by 3
 */
public class DivisibleBy3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        
        if (binaryNumber.isEmpty()) {
            System.out.println("The binary number is empty.");
        }
        else if (isDivisibleBy3(binaryNumber)) {
            System.out.println(binaryNumber + " is divisible by 3.");
        } 
        else {
            System.out.println(binaryNumber + " is not divisible by 3.");
        }
        
        scanner.close();
	}

	private static boolean isDivisibleBy3(String binaryNumber) {
		int sum = 0;
		
		for(int i = binaryNumber.length() - 1;i>=0;i--) {
			int digit = binaryNumber.charAt(i) - '0';
			//System.out.println("d" + digit);
			
			sum+= digit;
			//System.out.println("s" + sum);
			
			if(sum == 2) sum = 0;
			
			//System.out.println("sum" + sum);
		}
		
		return sum % 3 == 0;
	}

}
