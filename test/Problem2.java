package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String literatureText = "Jack and Jill went to buy bread and cheese.Cheese is Jack's and Jill's favourite food";
		String[] wordsToExcludestr = { "and", "he", "the", "to", "is", "jack", "jill" };
		List<String> wordsToExclude = new ArrayList<String>();

		for (String s : wordsToExcludestr) {
			wordsToExclude.add(s);
		}

		List<String> words = retrieveMostFrequentlyUsedWords(literatureText, wordsToExclude);

		for (String s : words) {
			System.out.println(s);
		}
	}

	private static List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		int maxCount = Integer.MIN_VALUE;
		List<String> MaxFreqList = new ArrayList<String>();
		for (char ch : literatureText.toCharArray()) {

			if (!Character.isAlphabetic(ch)) {
				if (hm.containsKey(sb.toString())) {
					hm.put(sb.toString(), hm.get(sb.toString()) + 1);
					if (hm.get(sb.toString()) == maxCount) {
						MaxFreqList.add(sb.toString());
					} else if (hm.get(sb.toString()) > maxCount) {
						MaxFreqList.clear();
						MaxFreqList.add(sb.toString());
					}
					maxCount = Math.max(maxCount, hm.get(sb.toString()));
				} else {
					if (!wordsToExclude.contains(sb.toString())) {
						hm.put(sb.toString(), 1);
					}

				}

				sb = new StringBuilder();
			} else {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return MaxFreqList;

	}

}
