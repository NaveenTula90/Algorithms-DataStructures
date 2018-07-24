package ProblemSolving;

import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the String one");
		String s1= sc.next();
		
		System.out.println("Eter the String one");
		String s2= sc.next();
		
		boolean check = checkPerm(s1,s2);
		
		System.out.println(check);
		
		sc.close();
	}

	private static boolean checkPerm(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length()!=s2.length())
			return false;
		
		int [] count_char =new int[128];
		

		for(int i =0;i<s1.length();i++) {
			
			count_char[s1.charAt(i)]++;
		}
		
		for(int i=0;i<s2.length();i++) {
			int c =(int)s2.charAt(i);
			count_char[c]--;
			
			if(count_char[c]<0) {
				return false;
			}
		}
		return true;
	}



}
