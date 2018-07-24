import java.util.Arrays;
import java.util.HashMap;

public class FourSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {-1,-1};
		int[] B= {-1,1};
		int[] C= {-1,1};
		int[] D= {1,-1};
		int count=0;
		int n =A.length;
		
		HashMap<Integer,Integer> hmSum1 =new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hmSum2 =new HashMap<Integer,Integer>();
		int t=0;
		for(int i =0;i<n;i++) {
			
			for(int j=0;j<n;++j) {
				
				int sum1=A[i]+B[j];
				int sum2 =C[i]+D[j];
				
				hmSum1.put(t, sum1);
				hmSum2.put(t, sum2);
				t++;
			}
		}
		
		for(int i =0;i<t;i++) {
			int compNum =(hmSum1.get(i)!=0) ? -(hmSum1.get(i)):0;
			if(hmSum2.containsValue(compNum)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
