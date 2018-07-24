package ProblemSolving;

import java.util.HashSet;
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
public class RemoveDups {
	
	public static void main(String[] args) {

		LinkedListNode ls =new LinkedListNode(0);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		
		//voidDeleteDupsbyHash(ls);
		voidDeleteDupsByPointer(ls);
		
		while(ls.next!=null) {
			System.out.println(ls.value);
			ls=ls.next;
			}
		System.out.println(ls.value);
}

	private static void voidDeleteDupsByPointer(LinkedListNode ls) {
		
		LinkedListNode curr = ls;
		
		while(curr!=null) {
			
			LinkedListNode runner = curr;
			
			while(runner.next!=null) {
				if(runner.next.value==curr.value) {
					runner.next =runner.next.next;
				}else {
					runner=runner.next;

				}
			}
			curr =curr.next;
		}
		
		
	}

	private static void voidDeleteDupsbyHash(LinkedListNode ls) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedListNode previous =null;
		
		while(ls!=null) {
			
			if(hs.contains(ls.value)) {
				previous.next = ls.next;
			}else {
				hs.add(ls.value);
				previous=ls;
			}
			ls=ls.next;
		}
	}
	
	

}
