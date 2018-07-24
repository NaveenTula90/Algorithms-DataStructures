package ProblemSolving;

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
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ls = new LinkedListNode(3);
		ls.add(4);
		ls.add(5);
		ls.add(8);
		ls.add(10);
		LinkedListNode reverseHead = reverse(ls);
		
		while(reverseHead!=null) {
			System.out.println(reverseHead.value);
			reverseHead = reverseHead.next;
		}

	}

	private static LinkedListNode reverse(LinkedListNode ls) {
		// TODO Auto-generated method stub
		
		LinkedListNode head=null;
		while(ls!=null) {
			LinkedListNode current = new LinkedListNode(ls.value);
			current.next =head;
			head = current;
			ls=ls.next;
		}
		return head;
	}

}
