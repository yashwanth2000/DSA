package patterns;


/**
 * @author yashw
 *Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *
 */
public class Pattern10 {
	public static void main(String[] args) {
		int n = 6;
		
		for(int i=1;i<=2*n-1;i++) {
			int stars = i;
			if(i>n) stars = 2*n-i;
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		/*
		 * for (int i = 0; i < n; i++) { for (int j = 0; j < i; j++) {
		 * System.out.print("*"); } System.out.println(); } for (int i = 0; i < n; i++)
		 * { for (int j = i; j < n; j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

	}
}
