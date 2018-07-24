package ProblemSolving.stackandqueues;

public class SortStack<Integer> {

	Stack<Integer> ascSortStack, descSortStack;

	public SortStack() {
		ascSortStack = new Stack<Integer>();

	}

	public void sort(Stack<Integer> ascSortStack) {
		descSortStack = new Stack<Integer>();

		while (!ascSortStack.isEmpty()) {

			Integer temp = ascSortStack.pop();

			while (!descSortStack.isEmpty() && (int) descSortStack.peek() > (int) temp) {
				ascSortStack.push(descSortStack.pop());
			}
			descSortStack.push(temp);
		}

		while (!descSortStack.isEmpty()) {
			ascSortStack.push(descSortStack.pop());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
