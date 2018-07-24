import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = {-1, 0, 1, 2, -1, -4};
		ArrayList<ArrayList> sumSet = new ArrayList<ArrayList>();
		sumSet =sumThree(nums);
		sumSet.forEach(array->{
			array.forEach(System.out::println);
			System.out.println();
		});
	}

	private static ArrayList<ArrayList> sumThree(int[] nums) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList> sumSet = new ArrayList<ArrayList>();

		Arrays.sort(nums);
		int sum=0;
		
		for(int i =0;i<nums.length-2;i++) {
			
			if(i==0||nums[i]>nums[i-1]) {
			int j=i+1,k=nums.length-1;
			
			while(j<k) {

				sum = nums[i]+nums[j]+nums[k];
				
				if(sum==0) {
					ArrayList<Integer> set = new ArrayList<Integer>();
					set.add(nums[i]);
					set.add(nums[j]);
					set.add(nums[k]);
					sumSet.add(set);
					j++;
					k--;
					
					// To avoid duplicates
					while(nums[j]==nums[j-1]) {
						j++;
					}
					
					while(nums[k]==nums[k+1]) {
						k--;
					}
				}else if(sum<0) {
					j++;
				}else {
					k--;
				}
				
			}
			}
		}
		
		return sumSet;
	}

}
