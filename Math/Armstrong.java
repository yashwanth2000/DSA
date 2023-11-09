package basicMath;

import java.util.Scanner;

/**
 * @author yashw
 * Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Input:170 
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170
 */
public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no to check id it's armstrong or not");
		int n = scanner.nextInt();
		if (armstrong(n))
			System.out.println("Yes It is ArmStrong Number\n");

		else
			System.out.println("No It is not an ArmStrong Number\n");
		
		scanner.close();
	}

	private static boolean armstrong(int n) {
		int count = 0;
		int temp = n;
		int originalNum = n;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		int sumOfPower = 0;
		while (n != 0) {
			int digit = n % 10;
			sumOfPower += (int) Math.pow(digit, count);
			n = n / 10;
		}
		return (sumOfPower == originalNum);
	}
}
