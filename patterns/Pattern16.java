package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
A
B B
C C C

Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F
 */
public class Pattern16 {
	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)((int)('A'+i)));
				
			}
			System.out.println();
		}
	}
}
