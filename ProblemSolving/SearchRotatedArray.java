package ProblemSolving;

import java.util.Scanner;

public class SearchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] rotatedArr = new int[5];
		for(int i =0;i<rotatedArr.length;i++) {
			System.out.println("Enter the array element "+i+ "=");
			rotatedArr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the search element");
		int x =sc.nextInt();
		
		searchInRotated(rotatedArr,x);
		sc.close();

	}

	private static void searchInRotated(int[] rotatedArr, int x) {
		// TODO Auto-generated method stub
		
		System.out.println(search(rotatedArr,x,0,rotatedArr.length-1));
	}

	private static int search(int[] rotatedArr, int x, int left, int right) {
		
		int mid=(left+right)/2;
		
		if(x==rotatedArr[mid]) {
			return mid;
		}
		
		if(right<left) {
			return -1;
		}
		
		if(rotatedArr[left]<rotatedArr[mid]) { //left is ordered normally
			
			if(rotatedArr[left]<=x && x<rotatedArr[mid]) {
				return search(rotatedArr,x,left,mid-1);
			}else {
				return search(rotatedArr,x,mid+1,right);
			}
		}else if(rotatedArr[mid]<rotatedArr[right]) { //right is ordered normally
			
			if(rotatedArr[mid]<x && x <= rotatedArr[right]) {
				return search(rotatedArr,x,mid+1,right);
			}else {
				return search(rotatedArr,x,left,mid-1);
			}
		}else if(rotatedArr[left]==rotatedArr[mid]) {
				
				if(rotatedArr[mid]!=rotatedArr[right]) {
					return search(rotatedArr,x,mid+1,right);
				}else {
					int result = search(rotatedArr,x,left,mid-1);
					if(result == -1) {
						return search(rotatedArr,x,mid+1,right);
					}else {
						return result;
					}
				}
			}
		
		
		
		return -1;
	}

}
