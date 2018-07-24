import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {

		int[] S = {0,0,0,0 };
		int target =0;
		List<List<Integer>> sumSet = fourSum(S,target);

		sumSet.forEach(array -> {
			array.forEach(System.out::println);
			System.out.println();
		});
	}

	private static List<List<Integer>> fourSum(int[] s,int target) {

		List<List<Integer>> sumSet = new ArrayList<List<Integer>>();

		Arrays.sort(s);
		int sum=0;
		for(int i=0;i<s.length-3;i++) {
			
			for(int j=i+1;j<s.length-2;j++) {
				int l=j+1,r=s.length-1;
				
				while(l<r) {
					sum= s[i]+s[j]+s[l]+s[r];
					
					if(sum==target) {
						List<Integer> set =new ArrayList<Integer>();
						set.add(s[i]);
						set.add(s[j]);
						set.add(s[l]);
						set.add(s[r]);
						l++;
						r--;
						
						if(!sumSet.contains(set)) {
							sumSet.add(set);
						}
						
					}else if(sum<target) {
						l++;
					}else {
						r--;
					}
				}
			}
		}
		return sumSet;
	}

}
