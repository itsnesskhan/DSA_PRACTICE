package com.practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

import javax.lang.model.element.Element;

public class LargestSubarray {
	
	public static int largeSubArray(int[] arr, int sum) {
		int currentSum=0;
		int start =0;
		int end = -1;
		int maxlen =0;
		int[] prefix= new int[arr.length+1];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			currentSum+=arr[i];
			if (currentSum-sum==0) {
				start =0;
				end = i;
//				break;
				System.out.println(start+" "+ end);
				maxlen = Math.max(maxlen, end-start+1);
			}
			if(map.containsKey(currentSum-sum)) {
				start = map.get(currentSum-sum)+1;
				end = i;
//				break;
				System.out.println(start+" "+end);
				maxlen = Math.max(maxlen, end-start+1);
			}
			map.put(currentSum, i);
			
		}
		System.out.println(map);
		if(end==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Sub array present in"+start+" and "+end);
		}
//		prefix[0] =0;
//		for (int i = 1; i < prefix.length; i++) {
//			prefix[i] = prefix[i-1]+arr[i-1];
//		}
//		
//		System.out.println(Arrays.toString(prefix));
		return maxlen;
	}
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		
	}
	}
	public void haveLeftView(Node root,ArrayList<Integer> list) {
		if(root!=null) {
			list.add(root.data);
		}

		return;
	}
	
	ArrayList<Integer> leftView(Node root)
    {
     ArrayList<Integer> list = new ArrayList<Integer>();
     haveLeftView(root, list);
     haveLeftView(root.left, list);
          
     return list;
    }
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        TreeSet<Integer> list = new TreeSet<Integer>();
           HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
           for(int i=0;i<n;i++){
               if(map.containsKey(arr[i])){
                   map.put(arr[i],map.get(arr[i]+1));
                   list.add(arr[i]);
               }
               else{
                   map.put(arr[i],1);
               }
           }
           if(list.size()==0){
               list.add(-1);
           }
           return new ArrayList<Integer>(list);
           
   }
	
	static String ReFormatString(String S, int K){
		String rvString="";
		String[] split2 = S.split("-");
		for (String string : split2) {
			rvString+=string;
		}
		System.out.println(rvString);
		String[] split = rvString.split("(?!^)");
		System.out.println(Arrays.toString(split));
		int rem= split.length%K;
		int ti= split.length/K;
		String returnrString="";
			
		
		System.out.println(returnrString);
		
		return null;
    }
	
	boolean isBST(Node root)
    {
        if(root ==null){
            return true;
        }
        
        if(root.left!=null && root.left.data>=root.data) {
        	return false;
        }
        
        if(root.right!=null && root.right.data<=root.data) {
        	return false;
        }
        
        
        return isBST(root.left) && isBST(root.right);
    }
	
    static <E> ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int i=0;
        for (; i <k; i++) {
			queue.add(arr[i]);
		}
        list.add(queue.peek());
        for (; i<n;i++) {
			queue.add(arr[i]);
			
			list.add(queue.peek());
			
			queue.remove(i-k+1);
		}
        return list;
    }
	
	public static void main(String[] args) {
		int arr[] ={15,-2,2,-8,1,7,10,23};
		System.out.println(largeSubArray(arr, 8));
		ReFormatString("2-5g-3-J",2);
	}

}
