package ProblemSolving;

import java.util.Scanner;

public class PrintAllPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printAllPalindrome(str);
		sc.close();
	}

	private static void printAllPalindrome(String str) {

		int[] charCount = new int[128];

		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}

		char mid = 0;
		boolean ispalindrome = false;
		for (int i = 0; i < charCount.length; i++) {

			if (str.length() % 2 == 1) {

				if (charCount[i] % 2 == 1) {
					mid = (char) i;

					if (ispalindrome) {
						return;
					}
					ispalindrome = true;
				}
			}
			
			if(str.length() % 2 == 0) {
				if(charCount[i] % 2 == 1) {
					return;
				}
			}
		}
		System.out.println(mid);
		String palindromeStr = new String();
		
		if(mid!=0) {
			palindromeStr.charAt(str.length()/2);
		}

	}

}
