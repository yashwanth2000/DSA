package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
  A  
 ABA 
ABCBA


Input Format: N = 6
Result:   
     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA
 */
public class Pattern17 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			int breakpoint = (2 * i + 1) / 2;
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(ch);
				if (j < breakpoint)
					ch++;
				else
					ch--;
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
