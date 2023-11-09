package basicMath;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check whether Prime or Not");
		int num = scanner.nextInt();
		System.out.println(isPrime(num));
		scanner.close();
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		if (num == 2)
			return true;
		for(int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
