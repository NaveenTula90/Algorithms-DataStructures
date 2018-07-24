
public class NonDecreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 3,4,2,3 };
		System.out.println(isNonDecreasing(num));
	}

	private static boolean isNonDecreasing(int[] a) {

		int modified = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				if (modified++ > 0)
					return false;

				if (i - 2 < 0 || a[i - 2] <= a[i])
					a[i - 1] = a[i]; // lower a[i - 1]
				else
					a[i] = a[i - 1]; // rise a[i]
			}
		}
		return true;

	}

}
