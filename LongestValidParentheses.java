import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(longestValidParenthese(s));
		sc.close();
	}

	private static int longestValidParenthese(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		stack.add(-1);
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {

				stack.pop();
				if (!stack.isEmpty()) {
					if (i - stack.peek() > max) {
						max = i - stack.peek();
					}
				}else {
					stack.push(i);
				}

			}
		}
		return max;
	}

}
