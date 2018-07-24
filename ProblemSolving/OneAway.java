package ProblemSolving;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ENter the the string 1");
		String s1 = sc.nextLine();
		
		System.out.println(" ENter the the string 2");
		String s2 = sc.nextLine();
		
	// System.out.println(oneAway(s1,s2));	
		System.out.println(oneAway1(s1,s2));
		
		sc.close();
	}

	private static boolean oneAway1(String s1, String s2) {
		// TODO Auto-generated method stub
		
		String longString = s1.length() > s2.length() ? s1 : s2;
		String smallString = s1.length() > s2.length() ? s2 : s1;
		System.out.println(longString);
		System.out.println(smallString);
		int longIndex1=0, smallIndex=0;
		boolean foundDiff = false;
		while(longIndex1 < longString.length() && smallIndex < smallString.length()) {
			
			if(longString.charAt(longIndex1)!=smallString.charAt(smallIndex)) {
				
				if(foundDiff) {
					return false;
				}
				
				foundDiff = true;
				if(longString.length() == smallString.length()) {
					smallIndex++;
				}
			}else {
				smallIndex++;
			}
			
			longIndex1++;
		}
		return true;
	}

	private static boolean oneAway(String s1, String s2) {
		
		if(s1.length()==s2.length()) {
			return oneEditReplace(s1,s2);
		}
		else if(s1.length()+1==s2.length()) {
			return oneEdit(s1,s2);
		}
		
		else if(s1.length()-1==s2.length()) {
			return oneEdit(s2,s1);
		}
		return false;
	}

	private static boolean oneEdit(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			
			if(s1.charAt(i)!=s2.charAt(j)) {
				
				if(i!=j) {
					return false;
					
				}
				i++;
			}
			
			i++;
			j++;
		}
		return true;
	}

	private static boolean oneEditReplace(String s1, String s2) {
		// TODO Auto-generated method stub
		
		boolean foundDiff = false;
		
		for(int i =0;i<s1.length();i++) {
			
			if(s1.charAt(i)!=s2.charAt(i)) {
				
				if(foundDiff)
				 return false;
				
				foundDiff=true;
			}
		}
		return true;
	}

}
