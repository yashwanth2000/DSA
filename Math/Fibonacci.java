package basicMath;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number upto which fibonacci to print");
		int number = scanner.nextInt();
		System.out.println("Fibonacci series upto " + number + " numbers : ");
		for (int i = 1; i <= number; i++)
			System.out.println(fibonacci(i));
		scanner.close();
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
}
