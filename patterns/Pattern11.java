package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
1
01
101

Input Format: N = 6
Result:   
1
01
101
0101
10101
010101
 */
public class Pattern11 {
	public static void main(String[] args) {
		int n = 6;
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				start = 1;
			else
				start = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}
}
