package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class KdiffPair {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int k = -1;
		int count = 0;
		Map<Integer, Integer> diffMap = new HashMap<Integer, Integer>();

		for(int i:arr) {
			
			diffMap.put(i, diffMap.getOrDefault(i,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:diffMap.entrySet()) {
			if(k==0) {
				if(entry.getValue()>=2) {
					count++;
				}
			}else {
				if(diffMap.containsKey(entry.getKey()+k)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
