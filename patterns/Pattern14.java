package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
A
A B
A B C

Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
public class Pattern14 {
	public static void main(String[] args) {
		int n = 6;
		for(int i =0;i<n;i++) {
			for(char ch = 'A';ch<='A'+i;ch++) {
				System.out.print(ch +" ");
			}
			System.out.println();
		}
	}
}
