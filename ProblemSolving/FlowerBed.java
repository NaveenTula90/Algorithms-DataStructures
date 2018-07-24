package ProblemSolving;

public class FlowerBed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] flowerbed= {1,0,0,0,1};
		int n=2;
		
		System.out.println(isFlower(flowerbed,n));

	}

	private static boolean isFlower(int[] flowerbed, int n) {
		int count=0;
		for(int i=1;i<flowerbed.length;i++) {
			if(flowerbed[i]==0) {
				if(flowerbed[i-1]==0 && flowerbed[i+1]==0) {
					count++;
				}
			}
		}
		
		if(count==n) {
			return true;
		}
		
		return false;
	}

}
