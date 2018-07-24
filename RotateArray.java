
public class RotateArray {

	public static void main(String[] args) {
		int[] nums= {-1,-100,3,99};
		int k=3;
				
		k%=nums.length;
		
		reverse(0,nums.length-1,nums);
		reverse(0,k-1,nums);
		reverse(k,nums.length-1,nums);
		
		for(int i:nums) {
			System.out.println(i);
		}
	}

	private static void reverse(int start, int end, int[] nums) {
		// TODO Auto-generated method stub
		
		
		while(start<end) {
			
			int temp =nums[end];
			nums[end]=nums[start];
			nums[start]=temp;
			start++;
			end--;
		}
	}

}
