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

class Result{
	int size;
	LinkedListNode tail;
	
	public Result(LinkedListNode tail,int size) {
		this.tail =tail;
		this.size=size;
	}
}
public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode L1=new LinkedListNode(3);
		LinkedListNode L2=new LinkedListNode(4);
		LinkedListNode intersectNode = findIntersectionNode(L1,L2);
		
	}

	private static LinkedListNode findIntersectionNode(LinkedListNode l1, LinkedListNode l2) {
		// TODO Auto-generated method stub
		if(l1==null || l2==null) {
			return null;
		}
		
		Result result1=getTailandSize(l1);
		Result result2=getTailandSize(l2);
		
		LinkedListNode longer=result1.size>result2.size?l1:l2;
		LinkedListNode smaller=result1.size>result2.size?l1:l2;

		longer =getTheKthLastNode(longer,Math.abs(result1.size-result2.size));
		
		while(longer!=smaller) {
			
			longer=longer.next;
			smaller=smaller.next;
		}
		return longer;
	}

	private static LinkedListNode getTheKthLastNode(LinkedListNode longer, int k) {
		// TODO Auto-generated method stub
		while(longer!=null && k>0) {
			k--;
			longer=longer.next;
		}
		return longer;
	}

	private static Result getTailandSize(LinkedListNode l) {
		// TODO Auto-generated method stub
		int size=0;
		
		while(l.next!=null) {
			size++;
			l=l.next;
		}
		return new Result(l,size);
	}

}
