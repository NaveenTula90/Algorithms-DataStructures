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
public class KthtoLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode ls =new LinkedListNode(0);
		ls.add(3);
		ls.add(2);
		ls.add(7);
		ls.add(2);
		ls.add(4);
		
	System.out.println(	KthelementtoLast(ls).value);

	}

	private static LinkedListNode KthelementtoLast(LinkedListNode ls) {
		// TODO Auto-generated method stub
		
		LinkedListNode p1 = ls;
		LinkedListNode p2 = ls;
		
		int count = 0;
		int k =1;
		while(count != k) {
			p1=p1.next;
			count++;
		}
		
		while(p1.next!=null) {
			p1 = p1.next;
			p2=p2.next;
		}
		
		return p2;
		
	}

}
