import java.util.Scanner;

public class SumOfMultiple3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int X = sc.nextInt();
		
		System.out.println("sumOfMultiple3or5(X)"+ sumOfMultiple3or5(X));
		
		sc.close();
				
				
				

	}

	private static int sumOfMultiple3or5(int x) {
		int sum = 0;
		for(int i=0;i<x;i++) {
			
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;

	}
	

}
