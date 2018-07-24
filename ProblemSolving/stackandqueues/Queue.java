package ProblemSolving.stackandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
	
	private static class QueueNode<T>{
		T data;
		QueueNode<T> next;
		
		public QueueNode(T data) {
			this.data = data;
		}
	}
	
	public QueueNode<T> first;
	public QueueNode<T> last;
	
	public void add(T item) {
		QueueNode<T> t =new QueueNode<T>(item);
		if(last!=null) {
		last.next =t;
		}
		last=t;
		
		if(first==null) {
			 first=last;
		}
	}
	
	public T remove() {
		
		if(first == null) {
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
		if(first==null) {
			last = null;
		}
		return data;
		
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
