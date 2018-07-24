package datastructures;

public class BinaryTree {
	
	class Node{
		int value;
		Node right;
		Node left;
		
		Node(int value){
			this.value=value;
			right=null;
			left=null;
		}
	}
	
	Node root;
	
	public Node addRecursive(Node current,int val) {
		
		if(current==null) {
			return new Node(val);
		}
		if(val<current.value) {
			current.left=addRecursive(current.left, val);
		}else if(val>current.value) {
			current.right=addRecursive(current.right, val);
		}else {
			return current;
		}
		return current;
		
	}
	
	public void add(int val) {
		root =addRecursive(root, val);
	}
	
	//Finding an element
	
	public boolean containsNodeRecursive(Node current,int value) {
		
		if(current==null) {
			return false;
		}
		
		if(current.value==value) {
			return true;
		}
		return value>current.value ? containsNodeRecursive(current.right, value)
				: containsNodeRecursive(current.left, value);
		
	}
	
	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}
	
	public Node deleteRecursive(Node current,int value) {
		
		if(current.left==null && current.right==null) {
			return null;
		}
		
		
		
		return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb =new StringBuilder();
		sb.append(str);
	}

}
