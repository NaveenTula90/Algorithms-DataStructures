import java.util.Scanner;

public class Maximumheightofthestaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of blocks");
		int N=sc.nextInt();
		
		int k=maxHeight(N);
		System.out.println(k);
		sc.close();
	}

	private static int maxHeight(int n) {
		// TODO Auto-generated method stub
		int height=0;
		int sum=0;
		for(int i =1;i<=n;i++) {
			
			n=n-i;
			height=height+1;
			if(n==0||n<0)
				break;
		}
		return height;
	}

}
