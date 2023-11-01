package patterns;

/**
 * @author yashw
 *Input Format: N = 3
Result: 
1
2 3
4 5 6

Input Format: N = 6
Result:   
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
 */
public class Pattern13 {
	public static void main(String[] args) {
		int n = 6;
		int num = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num + " ");
				num+=1;
			}
			System.out.println();
		}
	}
}
