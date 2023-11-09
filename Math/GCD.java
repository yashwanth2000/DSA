package basicMath;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.println("Enter num1 and num2: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		int ans = gcd(n1, n2);
		System.out.println("GCD: " + ans);
		scanner.close();
	}

	private static int gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		return gcd(n2, n1 % n2);
	}
}
