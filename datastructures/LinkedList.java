package datastructures;

class Node{
	Node next;
	int data;
	
}

public class LinkedList {
	
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void insertFirst(int d) {
		Node newNode = new Node();
		newNode.data=d;
		newNode.next=head;
		head=newNode;
	}
	
	public void deleteFirst() {
		head=head.next;
		
	}
	
	public void deleteAfter(Node after) {
		Node temp=head;
		while(temp.next!=null&&temp.data==after.data) {
			temp=temp.next;
		}
		
		if(temp.next!=null) {
			temp.next=temp.next.next;
		}
	}
	
	public void insertAfter(Node after,int val) {
		Node temp=head;
		while(temp.next!=null && temp.next==after) {
			temp=temp.next;
		}
		
		Node n = new Node();
		n.data=val;
		Node temp1=temp.next.next;
		temp.next=n;
		n.next=temp1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
