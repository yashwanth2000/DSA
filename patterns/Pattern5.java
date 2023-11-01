package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
* * *
* * 
*

Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 
 */
public class Pattern5 {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
