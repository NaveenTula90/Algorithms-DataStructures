
public class ShortCompletionWord {

	public static void main(String... args) {

		String licensePlate = "1s3 456".toLowerCase();
		String[] words = {"looks", "pest", "stew", "show"};

		int[] countlicensPlate = new int[128];
		for (int i = 0; i < licensePlate.length(); i++) {

			if (Character.isAlphabetic(licensePlate.charAt(i))) {
				countlicensPlate[licensePlate.charAt(i) - 'a']++;
			}
		}

		int Min_len = Integer.MAX_VALUE;
		String minCompleteString = "";

		for (String s : words) {
			int[] readArr = countlicensPlate;
			boolean completeString = true;
			for (int i = 0; i < s.length(); i++) {

				if (readArr[s.charAt(i) - 'a'] > 0) {
					readArr[s.charAt(i) - 'a']--;
				}
			}

			for (int i = 0; i < 128; i++) {

				if (readArr[i] > 0) {
					completeString = false;
					break;
				}

			}

			if (completeString) {

				if (Min_len > s.length()) {
					Min_len = s.length();
					minCompleteString = s;
				}

			}

		}

		System.out.println(minCompleteString);
	}
}
