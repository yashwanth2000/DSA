package basicMath;

/**
 * @author yashw
 *Example 1:
Input: N = 12345
Output: 5
Explanation: N has 5 digits

Example 2:
Input: N = 8394
Output: 4
Explanation: N has 4 digits
 */
public class CountDigits {
	public static void main(String[] args) {
		int n =12345;
		int x = n;
		int count = 0;
		while(x != 0) {
			x = x/10;
			count++;
		}
		System.out.println(count);
	}
}
