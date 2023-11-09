package basicMath;
import java.util.Scanner;

public class IntPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int palindrome = scanner.nextInt();
		
		if(isPalindrome(palindrome))
			System.out.println("Number : " + palindrome
	                   + " is a palindrome");
		else
			System.out.println("Number : " + palindrome
	                   + " is not a palindrome");
		scanner.close();
	}

	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;
		
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		System.out.println(reverse);
		if (reverse == number) {
			return true;
		}
		
		return false;
	}
}
