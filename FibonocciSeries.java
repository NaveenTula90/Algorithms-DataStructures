import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int [] memo = new int[N+1];
		for(int i=0;i<N;i++) {
			System.out.println(i+"==>" + fib(i,memo));
		}
		sc.close();

	}

	private static int fib(int n, int[] memo) {
		// TODO Auto-generated method stub
		
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(memo[n]>0) return memo[n];
		
		memo[n] = fib(n-1,memo) + fib(n-2,memo);
		
		return memo[n];
	}

}
