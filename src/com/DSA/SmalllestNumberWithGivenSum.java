package com.DSA;

public class SmalllestNumberWithGivenSum {
	
	 static String smallestNumber(int n, int sum)
	    {
	        String ansstr="";
	        if(sum>9*n){
	            return "-1";
	        }
	        if (sum==0 && n>1) {
				return "-1";
			}
	        
	        sum-=1;
	        
	        for(int i=n-1;i>0;i--){
	            if (sum>9) {
	            	sum-=9;
					ansstr=9+ansstr;
				}
	            else {
					ansstr= sum+ansstr;
					sum=0;
				}
	        }
	        ansstr = sum+1+ansstr;
	        return ansstr;
	    }

	public static void main(String[] args) {
		String largestNumber = smallestNumber(3, 20);
		System.out.println(largestNumber);
	}
}
