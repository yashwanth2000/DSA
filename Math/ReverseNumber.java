package basicMath;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = scanner.nextInt();
		int x = n;
		int reverse = 0;
		
		while(x != 0) {
			int remainder = x % 10;
			reverse = reverse * 10 + remainder;
			x = x / 10;
		}
		
		System.out.println("Reversed: "+ reverse);
		scanner.close();
	}

}
