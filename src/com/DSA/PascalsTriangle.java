package com.DSA;


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
        if (numRows ==0) {
			return new ArrayList<>();
		}
        
        ArrayList<List<Integer>> List = new ArrayList<List<Integer>>();
        
        for(int i=1;i<=numRows;i++){
            
        	ArrayList<Integer> row = new ArrayList<Integer>();
        	
        	for (int j = 0; j < i; j++) {
				
        		if(j==0 || j== i-1) {
        			row.add(1);
        		}
        		else {
					row.add(List.get(i-2).get(j)+List.get(i-2).get(j-1)); // to ad we need last rows j and j-1 elements
				}
			}
        	List.add(row);
       }
        
        return List;
    }
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}
