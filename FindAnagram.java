import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagram {

	public static void main(String[] args) {

		String s = "abab";
		String p = "ab";

		List<Integer> result = new ArrayList<Integer>();
		int hits = 0;
		int[] arr = new int[256];
		for (int i = 0; i < p.length(); i++) {
			arr[p.charAt(i) - 'a']++;
		}

		for (int i = 0, k = 0; i < s.length(); i++) {
			if (--arr[s.charAt(i) - 'a'] >= 0 && ++hits == p.length()) {
				result.add(k);
			}

			if (i >= p.length() - 1 && ++arr[s.charAt(k++) - 'a'] > 0) {
				hits--;
			}
		}
		result.forEach(System.out::println);
		
	}

}
