package ProblemSolving.stackandqueues;

import java.util.ArrayList;

public class SetOfStacks {

	class Stack {
		private int capacity;
		StackNode top, bottom;
		private int size;

		class StackNode {
			int data;
			public StackNode below;
			public StackNode above;

			public StackNode(int value) {
				this.data = value;
			}
		}

		public Stack(int capacity) {
			this.capacity = capacity;
		}

		public boolean isFull() {
			return size == capacity;
		}

		public void join(StackNode above, StackNode below) {
			if (above != null)
				above.below = below;
			if (below != null)
				below.above = above;
		}

		public boolean push(int value) {
			if (size >= capacity)
				return false;
			size++;
			StackNode n = new StackNode(value);
			if (size == 1)
				bottom = n;
			join(n, top);
			top = n;
			return true;
		}

		public int pop() {
			StackNode t = top;
			top = top.below;
			size--;
			return t.data;
		}

		public boolean isEmpty() {
			return size == 0;
		}
		
		public int removeBottom() {
			StackNode b = bottom;
			bottom=bottom.above;
			size--;
			if(bottom!=null)bottom.below=null;
			return b.data;
		}
	}

	ArrayList<Stack> stacks = new ArrayList<Stack>();
	public int capacity;
	public void push(int v) {
		Stack last =getLastStack();
		if(last!=null&& !last.isFull()) {
			last.push(v);
		}else {
			Stack stack = new Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	public int pop() {
		Stack last = getLastStack();
		int v =last.pop();
		if(last.size==0)stacks.remove(stacks.size()-1);
		return v;
	}
	public Stack getLastStack() {
		if(stacks.size()==0)return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void pop(int index) {
		 leftShit(index,true);
	}
	
	public int leftShit(int index,boolean removed_top) {
		Stack stack = stacks.get(index);
		int removed_item = 0;
		if(removed_top) {
			 removed_item = stack.pop();
		}else {
			removed_item=stack.removeBottom();
		}
		
		if(stack.isEmpty()) {
			stacks.remove(index);
		}else if(stacks.size()>index+1){
			
		int v=	leftShit(index+1, false);
			 stack.push(v);

		}
			
		return removed_item;
	}
}
