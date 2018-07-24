package ProblemSolving;


public class ThirdMaxNum {

	public static void main(String[] args) {

		int[] nums= {1,-2147483648,2};
		
		System.out.println(thirdMax(nums));
	
	}

	private static int thirdMax(int[] nums) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE,mid=Integer.MIN_VALUE,small=Integer.MIN_VALUE;
		int count=0;
		
		for(int x:nums) {
			count++;
			if(x==max||x==mid) {
				continue;
			}
			
			if(x>max) {
				small=mid;
				mid=max;				
				max=x;
				
			}else if(x>mid) {
				small=mid;
				mid=x;
				
				
			}else if(x>=small) {
			small=x;	
			}
			
		}
		
		if(count>=3) {
			return small;
		}else {
			return max;
		}
	}

}
