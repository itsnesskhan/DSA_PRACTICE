package com.DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxOfAllSubArrays {
	
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list =  new ArrayList<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int i =0;
        for(;i<k;i++){
            queue.add(arr[i]);
        }
        list.add(queue.peek());
        queue.remove(arr[0]);
        
        for(;i<n;i++){
        	queue.add(arr[i]);
        	
        	list.add(queue.peek());
        	
        	queue.remove(arr[i-k+1]);
        }
        
        return list;
    }

}
