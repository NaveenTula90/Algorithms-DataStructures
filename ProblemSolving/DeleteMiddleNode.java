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
public class DeleteMiddleNode {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ls =new LinkedListNode(0);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		
		DeleteNode(ls,2);
		
		while(ls.next!=null) {
			System.out.println(ls.value);
			ls=ls.next;
			}
		System.out.println(ls.value);
		
	}

	private static LinkedListNode DeleteNode(LinkedListNode ls, int i) {
		
		if(i <0) {
			return ls;
		}
		
		while(ls.next!=null) {
			
			if(ls.next.value== i) {
				ls.next =ls.next.next;
				break;
			}
			
			ls =ls.next;
		}
		
		return ls;
		// TODO Auto-generated method stub
		
	}

}
