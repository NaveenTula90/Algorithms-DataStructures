package ProblemSolving;

import java.util.Scanner;

class LinkedListNode{
	int value;
	LinkedListNode next;
	
public	LinkedListNode(int n){
		this.value=n;
	}
	
	void add(int n) {
		
		LinkedListNode end =new LinkedListNode(n);
		LinkedListNode node =this;
		while(node.next!=null) {
			node = node.next;
		}
		
		node.next = end;
	}
	
	LinkedListNode deleteNode(LinkedListNode head,int n) {
		
		LinkedListNode currNode = head;
		
		if(currNode.value==n) {
			return head.next;
		}
		
		while(currNode.next!=null) {
			
			if(currNode.next.value==n) {
				currNode.next =currNode.next.next;
				return head;
			}
			
			currNode =currNode.next;
		}
		return head;
		
	}
}
public class PalindromeLL {

	public static void main(String[] args) {

		
		
		LinkedListNode ls =new LinkedListNode(1);
		ls.add(2);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		
		LinkedListNode reverseStackNode = getStackNode(ls);
		System.out.println(isequal(ls,reverseStackNode));
	}

	private static boolean isequal(LinkedListNode ls, LinkedListNode reverseStackNode) {
		// TODO Auto-generated method stub
		
		while(ls!=null && reverseStackNode!=null) {
			
			if(ls.value!=reverseStackNode.value) {
				return false;
			}
			
			ls=ls.next;
			reverseStackNode =reverseStackNode.next;
		}
		
		return ls==null&&reverseStackNode==null;
	}

	private static LinkedListNode getStackNode(LinkedListNode ls) {
		// TODO Auto-generated method stub
		LinkedListNode head =null;
		
		while(ls!=null) {
			LinkedListNode n = new LinkedListNode(ls.value);
			n.next=head;
			head =n;
			ls=ls.next;
		}
		return head;
	}

}
