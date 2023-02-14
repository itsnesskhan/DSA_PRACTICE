package com.DSA;

import java.util.ArrayList;

public class StokebyeSell {
	
    static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
       
       int i=0;
       int count=0;
       while(i<n-1){
    	   ArrayList<Integer> inList =  new ArrayList<Integer>();
           
    	   //buy
    	   
           while((i<n-1) && A[i+1]<=A[i])
               i++;
           
           if(i==n-1) {
        	   break;
           }
               
           inList.add(i++);
           
           //sell
           
           while((i<n) && A[i]>=A[i-1])
               i++;
               
           inList.add(i-1);        
           
           list.add(inList);
           count++;
         
       }
       if(count==0) {
    	   System.out.println("can't generate maximum profit");
    	   return list;
       }
       
       return list; 
       
   }
	
	public static void main(String[] args) {
//		int A[] = {100,180,260,310,40,535,695};
		int A[] = {4,3,2,1};
		int n= A.length;
		ArrayList<ArrayList<Integer>> stockBuySell = stockBuySell(A, n);
		System.out.println(stockBuySell);

	}

}
