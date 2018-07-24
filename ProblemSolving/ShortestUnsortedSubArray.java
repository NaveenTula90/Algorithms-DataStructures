package ProblemSolving;

import java.util.Stack;

public class ShortestUnsortedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2, 6, 4, 8, 10, 9, 15};
		
		System.out.println(lenShortArray(arr));
	}

	private static int lenShortArray(int[] arr) {
		
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1]>arr[i]) {
				min=Math.min(min, arr[i]);
				
			}
		}
		
		for(int j=arr.length-2;j>=0;j--) {
			
			if(arr[j]>arr[j+1]) {
				max=Math.max(max, arr[j]);
			}
		}
		
		
		int l=0,r=0;
		
		for( l=0;l<arr.length;l++) {
			if(arr[l]>min)
				break;
		}
		
		
		for( r=arr.length-1;r>=0;r--) {
			if(arr[r]<max)
				break;
		}
		return r-l>0?r-l+1:0;
	}

}
