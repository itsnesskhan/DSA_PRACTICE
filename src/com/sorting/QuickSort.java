package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int j = low; j < high; j++) {
			if (arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr,high , i);
		
		return i;
	}
	
	long power(int N,int R)
    {   int mad =(int) 10e9 +7;
        int num = (int) Math.pow(N,R);
     return (long) num-mad;
        
    }
	
	public static void quickSort(int[] arr, int low, int high) {
		if (low<high) {
			int pivot = partition(arr, low, high);
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
			
		}
		
	}
	
   

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}
	
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    
	    long[] arr = new long[n];
	    long pro =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==j){
                   continue;
               }
               pro*=nums[j];
            }
            arr[i] =pro; 
            
        }
        return arr;
} 
	
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int integer : a) {
			hashSet.add(integer);
		}
        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        for (int integer : b) {
			hashSet2.add(integer);
		}
        hashSet.retainAll(hashSet2);
     
        
        
        
    
        return hashSet.size();
    }
    
    static long nthFibonacci(long n){
        long mod = (long)100000007;
        if(n==0){
            return 1;
        }
        return n*nthFibonacci(n-1);
    }
    
 

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<Integer> queue = new LinkedList<Integer>();
        
        int i;
        for(i=0;i<k;i++) {
        	
        	
        	while (!queue.isEmpty() && arr[i]>= queue.peekLast()) {
				queue.removeLast();
			}
        	queue.addLast(i);
        }
        
        for(;i<n;i++) {
        	list.add(arr[queue.peek()]);
        	
        	while (!queue.isEmpty() && queue.peek()<= i-k) {
				queue.removeFirst();
			}
        	
        	while (!queue.isEmpty() && arr[i]>= arr[queue.peekLast()]) {
				queue.removeLast();
			}
        	
        	queue.addLast(i);
        }
        
        list.add(arr[queue.peek()]);  
        
        System.out.println("quue"+queue);
        System.out.println(list);
        
        return list;
    }
    
    public static int getFib(int n) {
    	if (n<=1) {
			return 1;
		}
    	return getFib(n-1)+getFib(n-2);
    }
    
    public static long[] printFibb(int n) 
    {
        long[] arr = new long[n];
        arr[0] = 1;
        int a=0;
        int b= 1;
        int c=0;
        for (int i = 1; i < arr.length; i++) {
			c = a+b;
			arr[i] = c;
			a=b;
			b=c;
			
		}
       
        
              
       return arr;
    }
	
	public static void main(String[] args) {
		int arr[] = {3,5,7,8,2,4};
        int arr2[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k=3;
        System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
//		long da = 1; 
//		double sqrt = Math.sqrt(da);
//		System.out.println((int)Math.floor(sqrt));
//		System.out.println(Arrays.toString(productExceptSelf(arr, 6)));
//		System.out.println(nthFibonacci(2	));
//		
//		int i=0;
//		for ( i = 0; i < 5; ++i) {
//			System.out.println(i);
//		}

//		System.out.println("after loop"+i);
//		System.out.println(Arrays.toString(arr2));
//		ArrayList<Integer> max_of_subarrays = max_of_subarrays(arr2, arr2.length, k);
//		System.out.println("maz"+max_of_subarrays);
//		long[] printFibb = printFibb(6);
//		System.out.println(Arrays.toString(printFibb));
	}
}
