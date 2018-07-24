import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		set.add(n);	
		System.out.println(isHappyNumber(n,set));
		
		sc.close();

	}

	private static boolean isHappyNumber(int n, Set<Integer> set) {
		
		if(n==1) {
			return true;
		}
		int sum =0;
		while(n>0) {
			sum+= (n%10)*(n%10);
			n=n/10;
		}		
		if(set.contains(sum)) {
			return false;
			
		}
		set.add(sum);
	return	isHappyNumber(sum, set);
		
	}

}
