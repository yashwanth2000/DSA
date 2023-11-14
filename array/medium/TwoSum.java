package arrays.medium;

public class TwoSum {
	public static void main(String[] args) {
		int[] num = {3,2,4};
		int target = 7;
		
		int[] indices = twoSum(num, target);
		if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
	}
	
	public static int[] twoSum(int[] num,int target) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] + num[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return num;
	}
}
