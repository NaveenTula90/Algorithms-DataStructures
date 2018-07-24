import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

	public static void main(String[] args) {
		
		int n =10;
		int primesCount=0;
		boolean[] isPrime=new boolean[n];
		for(int i=2;i<n;i++) {
			
			if(!isPrime[i]) {
				primesCount++;
				
				for(int j=2;i*j<n;j++) {
					isPrime[i*j]=true;
				}
			}
		}
		System.out.println(primesCount);
	}

}
