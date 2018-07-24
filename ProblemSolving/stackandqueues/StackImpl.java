package ProblemSolving.stackandqueues;

public class StackImpl {
	boolean empty = true;

	public boolean isEmpty() {
		return empty;
	}
	public void push(Object o) {
		empty =false;
	}

}
