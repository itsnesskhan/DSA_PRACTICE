package com.DSA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;import java.util.Queue;
import java.util.stream.Collectors;

public class KthLargest {
	
	public static int kthLargest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        
        for (int i = 0; i < k; i++) {
			priorityQueue.add(arr[i]);
		}
        
        for (int i = k; i < arr.length; i++) {
			if (priorityQueue.peek()<arr[i]) {
				priorityQueue.poll();
				priorityQueue.add(arr[i]);
			}
		}
        
        
        return priorityQueue.peek();
    }
	
	static int count(int[] arr, int n, int x) {
		
		
    	int frequency = Collections.frequency(Arrays.asList(arr), x);
        return frequency;
    }
	
	public static void main(String[] args) {
		int arr[] = {7, 10, 4,4, 3, 20, 15};
		int kthSmallest = kthLargest(arr, 0, 0, 2);
		System.out.println(kthSmallest);
		System.out.println(count(arr, arr.length,4));

	}

}
