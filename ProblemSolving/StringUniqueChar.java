package ProblemSolving;

import java.util.Scanner;

public class StringUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String s = sc.nextLine();

		boolean uniqueness = UniqueChar(s);
		System.out.println(uniqueness);

	}

	private static boolean UniqueChar(String s) {
		// TODO Auto-generated method stub

		boolean[] arr = new boolean[256];

		for (int i = 0; i < s.length(); i++) {

			if (arr[s.charAt(i)]) {

				return false;
			}
			arr[s.charAt(i)] = true;
		}
		return true;
	}

}
