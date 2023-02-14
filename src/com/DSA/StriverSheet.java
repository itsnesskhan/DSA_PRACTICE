package com.DSA;

import java.util.ArrayList;

public class StriverSheet {
	
	// question set zeroes
	
    public static void setZeros(int matrix[][]) {
    	
        int row = matrix.length;
        int column = matrix[0].length;
        
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
    	
    	for(int i=0;i<row;i++) {
    		
    		for(int j=0;j<column;j++) {
    			
    			if(matrix[i][j]==0 ) {
    				x.add(i);
    				y.add(j);
    			}
    		}
    	}
    	
    	System.out.println("row "+x);
    	System.out.println("column "+y);
    	
    	//for row
    	
    	for(int i=0;i<x.size();i++) {
    		
    		int index = x.get(i);
    		
    		for(int j=0;j<column;j++) {
    			matrix[index][j] = 0;
    		}
    	}
    	
    	//for column
    	
    	for(int i=0;i<y.size();i++) {
    		
    		int index = y.get(i);
    		
    		for(int j=0;j<row;j++) {
    			matrix[j][index] = 0;
    		}
    	}
    }
    
    public static void main(String[] args) {
//		int[][] arr = {
//				{10,3,6},
//				{4,21,0}
//				};
		
		int[][] arr = {
				{1,1,0},
				{0,1,1},
				{1,1,1}
		};
for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		setZeros(arr);
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
