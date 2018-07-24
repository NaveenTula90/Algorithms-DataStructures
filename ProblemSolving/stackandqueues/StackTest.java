package ProblemSolving.stackandqueues;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	public void testStackShouldEmpty() {
		StackDup stack = new StackDup(1);
		Assert.assertEquals(stack.size, 0);
	}

	public void testPush() {
		StackDup stack = new StackDup(1);
		stack.push(1);
		Assert.assertEquals(stack.size(), 1);
	}

	public void testPop() {
		StackDup stack = new StackDup(1);
		stack.push(1);
		stack.pop();
		Assert.assertEquals(stack.size(), 0);
	}

	@Test(expected = EmptyStackException.class)
	public void testEmpty() {
		StackDup stack = new StackDup(0);
		stack.pop();
	}

	@Test(expected = FullStackException.class)
	public void testFull() {
		StackDup stack = new StackDup(0);
		stack.push(1);
	}

	private class StackDup {

		private int size;
		int[] myStack;

		public StackDup(int size) {
			myStack = new int[size];
		}
		
		public int size() {
			return size;
		}

		public void push(int i) {
			if (myStack.length == size) {
				throw new FullStackException();
			}
			myStack[++size] = i;
		}

		public int pop() {
			if (myStack.length == 0) {
				throw new EmptyStackException();
			}
			return myStack[--size];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private class EmptyStackException extends RuntimeException {
	}

	private class FullStackException extends RuntimeException {
	}
	
	public void testIsEmpty() {
		StackImpl stack = new StackImpl();
		StackImpl one = new StackImpl();
		one.push(1);
		Assert.assertEquals(true, stack.isEmpty());
		Assert.assertEquals(false, one.isEmpty());
	}

}
