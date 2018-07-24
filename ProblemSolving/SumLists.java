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
public class SumLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the first input digits");
		int n1 = sc.nextInt();
		System.out.println("enter the digits");
		LinkedListNode firstNodeHead =new LinkedListNode(sc.nextInt());
		int count=0;
		LinkedListNode node =firstNodeHead;
		while(count<n1-1) {
			node.add(sc.nextInt());
			node=node.next;
			count++;
		}
		
		System.out.println("ENter the Second input digits");
		int n2 = sc.nextInt();
		System.out.println("enter the digits");
		LinkedListNode SecondNodeHead =new LinkedListNode(sc.nextInt());
		count =0;
		LinkedListNode node2 =SecondNodeHead;

		while(count<n2-1) {
			node2.add(sc.nextInt());
			node2=node2.next;
			count++;
		}
		
		sumLists(firstNodeHead,SecondNodeHead);

		sc.close();
	}

	private static void sumLists(LinkedListNode firstNodeHead, LinkedListNode secondNodeHead) {
		// TODO Auto-generated method stub
		
		LinkedListNode node =firstNodeHead;		
		int sum =0;
		int i=0;
		while(node!=null) {
			sum = (int) (sum+ node.value*(Math.pow(10,i)));
			i++;
			node=node.next;
		}
		LinkedListNode secondNode =secondNodeHead;		
		
		i=0;
		while(secondNode!=null) {
			sum = (int) (sum+ secondNode.value*(Math.pow(10,i)));
			i++;
			secondNode=secondNode.next;
		}
		
		System.out.println("sum=="+sum);
		
	}

}
