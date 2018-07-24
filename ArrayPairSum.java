import java.util.HashMap;

public class ArrayPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=16;
		int arr[]= {1,4,45,6,10,-8};
		HashMap hm =new HashMap<Integer,Boolean>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],Boolean.TRUE );
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(x-arr[i]>=0 && hm.containsValue(x-arr[i])) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
