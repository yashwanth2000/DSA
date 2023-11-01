package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
  *  
 *** 
*****   
Input Format: N = 6
Result:
     *     
    ***    
   *****   
  *******  
 ********* 
***********
 */
public class Pattern7 {
	public static void main(String[] args) {
		int n = 4;
		for(int i=0;i<n;i++) {
			for (int j = 0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			for (int j = 0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}   
	}
}
