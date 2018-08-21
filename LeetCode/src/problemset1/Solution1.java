package problemset1;

public class Solution1 {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6,7,8,11,17,0};
		int target=11;	
		int i,j = 1,x = 0,y = 0;
		
		for(  i=0;i<nums.length;i++) {
			for( j=1;j<nums.length;j++) {
				if((nums[i]+nums[j])==target) {
				
				x=i;
				y=j;
					
					
				}
			}
		}
		
		
		System.out.println(x+" "+y);
		
		

	}

}
