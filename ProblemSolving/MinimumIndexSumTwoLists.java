package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumTwoLists {

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "KFC", "Shogun", "Burger King" };
		for (String s : findRestaurant(list1, list2)) {
			System.out.println(s);
		}
		;

	}

	public static List<String> findRestaurant(String[] list1, String[] list2) {
		int sum = 0, min = Integer.MAX_VALUE;
		///String[] common = new String[list1.length];
		List<String> common=new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < list1.length; i++) {

			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					sum = i + j;
					if (sum <= min) {
						System.out.println("sum--->"+sum);

						min = sum;
						common.add(list1[i]);

					}
				}
			}

			
		}
		return  common;
	}

}
