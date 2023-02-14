package com.DSA;

public class LargestNumberWithGivenSum {
	
	 static String largestNumber(int n, int sum)
	    {
	        StringBuilder buff = new StringBuilder();
	        if(sum>9*n){
	            return "-1";
	        }
	        
	        for(int i=0;i<n;i++){
	            if(sum>=9){
	                sum-=9;
	                buff.append(9);
	            }
	            else{
	                buff.append(sum);
	                sum=0;
	            }
	        }
	        return buff.toString();
	    }

	public static void main(String[] args) {
		String largestNumber = largestNumber(5, 12);
		System.out.println(largestNumber);
	}
}
