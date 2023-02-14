package com.DSA;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;import java.util.Queue;

public class KthSmallest {
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
			priorityQueue.add(arr[i]);
		}
        
        for (int i = k; i < arr.length; i++) {
			if (priorityQueue.peek()>arr[i]) {
				priorityQueue.poll();
				priorityQueue.add(arr[i]);
			}
		}
        
        
        return priorityQueue.peek();
    }
	
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int kthSmallest = kthSmallest(arr, 0, 0, 4);
		System.out.println(kthSmallest);

	}

}
