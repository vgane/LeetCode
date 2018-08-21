package problemset1;


public class Solution {

public static void main(String[] args) {
		int[] nums= {1,3,5,6,7,8,15,17,11};
		int target=11;	
		twoSum(nums,target);
		System.out.println();
}

private static int[] twoSum(int[] nums, int target) {

	int i;
	int j = 0;
	for( i=0;i<nums.length;i++) {
		for(j=1;j<nums.length;j++) {
			if((nums[i]+nums[j])==target) {
			
			
				
				
			}
		}
	}
	int[] B= {i,j};
	return B;
	
}

	

}
