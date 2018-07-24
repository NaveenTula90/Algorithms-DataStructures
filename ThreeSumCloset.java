import java.util.Arrays;

public class ThreeSumCloset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target =-100;
		int [] nums= {1,1,1,0};
		
		int ans = threeSumClosest(nums,target);
		System.out.println(ans);
		
		
	}

	private static int threeSumClosest(int[] nums, int target) {		
		int diff=Integer.MAX_VALUE;
		int sum =0;
		int result =0;
		Arrays.sort(nums);
		for(int i =0; i<nums.length;i++) {
			
			int j=i+1,k=nums.length-1;
			
			while(j<k) {
				
				sum = nums[i]+nums[j]+nums[k];
				int sub = Math.abs(target-sum);
				if(sub<diff) {
					diff= sub;
					result = sum;
				}
				
				if(sum<=target) {
					j++;
				}else {
					k--;
				}
			}
			
		}
		
		
		return result;
	
	}

}
