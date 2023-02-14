package com.DSA;

public class KadanesAlgorithm {
	
	static long maxSubarraywithallNagative(int arr[], int n) {
		int max_so_far = arr[0];
		int max_ending_here = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			max_ending_here = Math.max(arr[i],max_ending_here+=arr[i]);
			max_so_far = Math.max(max_ending_here, max_so_far);
		}
		
		return max_so_far;
	}
	
	    
	    long maxProduct(int[] arr, int n) {
	        int ans =arr[0];
	        int min = ans;
	        int max = ans;
	        
	        for(int i=1;i<n;i++){
	            if(arr[i]<0){
	            	System.out.println(max+" "+min);
	                int temp = min;
	                min = max;
	                max = temp;
	                System.out.println(max+" "+min);
	            }
	            
	            max= Math.max(arr[i], max*arr[i]);
	            min = Math.min(arr[i],min*arr[i]);
	            ans= Math.max(max, ans);
	        }
	        
	        return ans;
	    }
	
	static long maxSubarraySum(int arr[], int n){// only work for postive number
        int cSum=0;
        int maxSum=0;
        
        for(int i=0;i<n;i++){
            
            cSum+=arr[i];
            
            if(cSum<0){
                cSum=0;
            }
            else
            if(cSum>maxSum){
                maxSum= cSum;
            }
            
            
        }
        if(maxSum==0){
            return -1;
        }
        return maxSum;
           
    }
	
	public static void main(String[] args) {
		 int Arr[] = {1,2,3,-2,5};
		 int N = 5;
		 int Arr2[] = {6, -3, -10, 0, 2};

		 long maxSubarraySum = maxSubarraywithallNagative(Arr, N);
		 System.out.println(maxSubarraySum);
		 KadanesAlgorithm algorithm = new KadanesAlgorithm();
		 long maxProduct = algorithm.maxProduct(Arr2, N);
		 System.out.println(maxProduct);

	}
}
