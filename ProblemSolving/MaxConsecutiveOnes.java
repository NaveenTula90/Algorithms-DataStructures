package ProblemSolving;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,0,1,1,1};
		System.out.println(maxCountConsecutiveones(arr));
	}

	private static int maxCountConsecutiveones(int[] arr) {
		
		int maxCount=0,count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==1) {
				count++;
			}else {
				maxCount=Math.max(maxCount, count);
				count=0;
			}
		}
		
		maxCount=Math.max(maxCount, count);
		return maxCount;
	}

}
