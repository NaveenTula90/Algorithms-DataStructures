package ProblemSolving.stackandqueues;

public class QueueViaStacks<T> {

	private Stack<T> stackOldest, stackNewest;

	public QueueViaStacks() {

		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}

	public void add(T item) {
		stackNewest.push(item);
	}

	public void shiftItems() {

		if (stackOldest.isEmpty()) {
			while (!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}

	public T peek() {
		shiftItems();
		return stackOldest.peek();
	}

	public T pop() {
		shiftItems();
		return stackOldest.pop();
	}
}
