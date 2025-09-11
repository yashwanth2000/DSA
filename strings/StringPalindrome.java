import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check whether it is palindrome or not");
		String string = scanner.next();
		System.out.println(isPalindrome(string));
		scanner.close();
	}

	public static boolean isPalindrome(String string) {
		String reverse = reverse(string);
		if (string.equals(reverse))
			return true;
		return false;
	}

	public static String reverse(String String) {
		String revString = "";
		if (String == null || String.isEmpty())
			return String;
		for (int i = String.length() - 1; i >= 0; i--)
			revString = revString + String.charAt(i);
		return revString;
	}
}
