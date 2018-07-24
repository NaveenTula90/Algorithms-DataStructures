package ProblemSolving.stackandqueues;

public class MinStack extends Stack<Integer>{
	
	Stack<Integer> s2;
	
	public MinStack() {
		s2 = new Stack<Integer>();
	}
	
	public void push(int value) {
		
		if(value<min()) {
			s2.push(value);
		}
		
		super.push(value);
	}

	private int min() {
		// TODO Auto-generated method stub
		if(s2.isEmpty()) {
			return Integer.MAX_VALUE;
		}else {
			return s2.peek();
		}
		 
	}

	public Integer pop() {
		
		int value = super.pop();
		if(value==min()) {
			s2.pop();
		}
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
