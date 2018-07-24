import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisappeared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		numbersDisappeared(nums);
	}

	private static void numbersDisappeared(int[] nums) {
		
		List<Integer> missedNumbers = new ArrayList<Integer>();
	
		for(int i =0;i<nums.length;i++) {
			int index = Math.abs(nums[i])-1;
			if(nums[index]>0) {
			nums[index]=-nums[index];}
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				missedNumbers.add(i+1);
			}
		}
		missedNumbers.forEach(System.out::println);
	}

}
