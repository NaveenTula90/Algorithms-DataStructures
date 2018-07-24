
public class TrappingWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int ans = trap(height);
		System.out.println(ans);
	}

	private static int trap(int[] height) {
		
		if(height ==null) {
			return -1;			
		}
		int ans=0;

		int[] leftArray = new int[height.length];
		int[] rightArray = new int[height.length];
		leftArray[0]=height[0];
		rightArray[height.length-1]=height[height.length-1];
		
		for(int i =1;i<leftArray.length;i++) {
			leftArray[i]=Math.max(height[i], leftArray[i-1]);
		}
		
		for(int i =rightArray.length-2;i>=0;i--) {
			rightArray[i]=Math.max(height[i], rightArray[i+1]);
		}
		
		for(int i=0;i<height.length;i++) {
			ans+=Math.min(leftArray[i], rightArray[i])-height[i];
		}
		return ans;
	}

}
