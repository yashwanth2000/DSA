package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
1 2 3
1 2
1

Input Format: N = 6
Result:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
 */
public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			for (int j = n; j > i; j--)
	        {
	            System.out.print(n-j+1+" ");
	        }
			System.out.println();
		}
	}
}
