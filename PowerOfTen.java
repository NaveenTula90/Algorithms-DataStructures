import java.util.Scanner;

public class PowerOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number");
		int num=sc.nextInt();
	
		boolean flag=powerCalculate(num,10);
		
		if(flag) {
			System.out.println("power of ten");
		}else {
			System.out.println("not a power of ten");
		}
		sc.close();
	}

	private static boolean powerCalculate(int num, int i) {		
		if(num==1) {
			return true;
		}
		
		int pow=1;
		while(pow<num) {
			pow=pow*i;
			
			if(pow==num) {
				return true;
			}
		}
		
		
		
		return false;
	}

}
