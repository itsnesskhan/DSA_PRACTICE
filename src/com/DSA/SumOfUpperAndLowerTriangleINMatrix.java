package com.DSA;

public class SumOfUpperAndLowerTriangleINMatrix {
	
	
	public static void sumOfTriangles(int[][] matrix) {
		// row column of equal length
		
		 int row = matrix.length;
		 int column = matrix[0].length-1;
		 int upperSum =0;
		 int lowerSum =0;
		
		for(int i=0;i<row;i++) {
			//uper triangle
			for(int j=column;j>=i;j--) {
				
				upperSum+=matrix[i][j];
			}
			
			//lower triangle
			for(int j=0;j<=i;j++) {
				
				lowerSum+=matrix[i][j];
			}
			
		
		}
		
		System.out.println("upper sum "+upperSum);
		System.out.println("lower sum "+lowerSum);
	}

	public static void main(String[] args) {
		int[][] arr = {
				{6,5,4},
				{1,2,5},
				{7,9,7}
		};
		
		sumOfTriangles(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
