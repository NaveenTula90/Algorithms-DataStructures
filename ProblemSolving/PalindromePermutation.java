package ProblemSolving;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		boolean pp = palindormePerm(s);
		System.out.println(pp);
		sc.close();

	}

	private static boolean palindormePerm(String s) {
		// TODO Auto-generated method stub
		
		s =s.replaceAll("\\s", "");
		 System.out.println(s);
		 int [] arr = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		 int count =0;
		 
		
		 for(char c: s.toCharArray()) {
			 System.out.println(c +"==>"+ Character.getNumericValue(c));
			 int x =getCharNumber(c);
			 System.out.println(x);
			 if(x!=-1) {
				 arr[x]++;
				 
				 if(arr[x]%2==1) {
					 count++;
				 }else {
					 count--;
				 }
			 }	
		 }
		 
		 return count<=1;
	}

	private static int getCharNumber(char c) {
		
		if(Character.getNumericValue('a')<=Character.getNumericValue(c) 
				&& Character.getNumericValue(c)<=Character.getNumericValue('z')) {
			return Character.getNumericValue(c) - Character.getNumericValue('a');
		}
		return -1;
	}

}
