package test;

import java.util.Scanner;

class TestCase{
	int x;
	
	public TestCase(int value) {
		this.x =value;
	}
	
	public void checkDivisiblebyBoth(int x){
		if("Very Good".equals(Palindrome.returnString(x))) {
			System.out.println("x is divisble by 5 and 7");
		}
	}
}
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		System.out.println(returnString(s));
		TestCase test = new TestCase(35);
		test.checkDivisiblebyBoth(35);
		sc.close();

	}

	public static String returnString(int s) {
		
		if(s%5==0&&s%7==0) {
			return "Very Good";
		}else if(s%7==0) {
			return "Good";
		}else if(s%5==0) {
			return "Very";
		}
		
		return "";
		
		
	}

}
