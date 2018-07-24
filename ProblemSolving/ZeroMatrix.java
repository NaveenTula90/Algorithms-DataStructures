package ProblemSolving;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the row size");
	//	int row_size=sc.nextInt();
		
		System.out.println(" Enter the col size");
	//	int col_size=sc.nextInt();
		
		//int [][] matrix = new int[row_size][col_size];
		int arr[][]={{10,20,70},{30,0,40},{50,60,80}};
		/*for(int i=0;i<row_size;i++) {
			
			for(int j=0;j<row_size;j++) {
				
				matrix[i][j] = sc.nextInt();
			}
		}*/
		
		setZero(arr);
		
		sc.close();

	}

	private static void setZero(int[][] matrix) {
		// TODO Auto-generated method stub
		
		int row_size = matrix.length;
		int col_size = matrix[0].length;
		
		System.out.println(row_size);
		System.out.println(col_size);
		
		int [] rowZero = new int[row_size];
		int [] colZero = new int[col_size];
		int k=0;
		
		for(int i =0; i<row_size;i++) {
			
			for(int j =0;j<col_size;j++) {
				
				if(matrix[i][j]==0) {
					rowZero[k]=i; // contains row index of Zero
					colZero[k]=j; // contains col index of zero
					k++;
					System.out.println("k=="+k);
				}
			}
			

		}
		
		
		// set the whole row to zero
		for (int row = 0; row < rowZero.length; row++) {
			System.out.println(row +" " +rowZero[row]);

			for (int i = 0; i < col_size; i++) {
				matrix[rowZero[row]][i] = 0;
			}
		}
		
		for(int col=0;col<colZero.length;col++) {
			System.out.println(col+" "+colZero[col]);

			for(int j=0;j<row_size;j++) {
				matrix[j][colZero[col]]=0;
			}
		}
		
		
	}

}
