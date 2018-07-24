import java.util.HashMap;
import java.util.Scanner;

public class SecondMostRepeatedStringSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc=new Scanner(System.in);
		String s = "aaaa bbb c";//sc.next(); 
	//String [] strings=s.split(" ");
		int[] count =new int[256];
		
		for(int i=0;i<s.length();i++) {
		//	System.out.println(s.charAt(i));
			(count[s.charAt(i)])++;
		}
		
		int first=0,second=0;
		for(int i=0;i<256;i++) {
			
			if(count[i]>count[first]) {
				second=first;
				first=i;
			}else if(count[i]>count[second]&&count[first]!=count[i]) {
				second=i;
			}
		}
		
		System.out.println((char)second);
		
	}

}
