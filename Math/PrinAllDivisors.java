package basicMath;

import java.util.Scanner;

/**
 * @author yashw
 *Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 */
public class PrinAllDivisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = scanner.nextInt();
		System.out.println("The Divisors of "+n+" are:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				
				System.out.println(i + " ");
		}

		scanner.close();
	}
}
