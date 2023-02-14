package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class LeastGreaterNumber {
	
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
    	int max_so_far = 0;
        ArrayList<Integer> list =   new ArrayList<Integer>();
          
        TreeSet<Integer> set = new TreeSet<Integer>();
        	
          for(int i=0; i<n;i++){
        	 set.add(arr[i]);   
          }  
          
          for (int i = 0; i <arr.length; i++) {
			if (set.higher(arr[i])==null) {
				System.out.println(arr[i]+" ------>"+null);
			}
			else {
				System.out.println(arr[i]+"-------->"+set.higher(arr[i]));
				list.add(arr[i]);
			}
			set.remove(arr[i]);
		}
          
          System.out.println(set);
          return list;
      }
    
    
    public static ArrayList<Integer> findLeastGreatereIntegers(int n, int[] arr) {
    	int max_so_far = 0;
        ArrayList<Integer> list =   new ArrayList<Integer>();
          
        TreeSet<Integer> set = new TreeSet<Integer>();
        HashSet<Integer> hashSet = new HashSet<>();
        	
          for(int i=0; i<n;i++){
        	 set.add(arr[i]);   
          }  
          
          for (int i = 0; i <arr.length; i++) {
			if (set.higher(arr[i])==null) {
				System.out.println(arr[i]+" ------>"+null);
			}
			else {
				System.out.println(arr[i]+"-------->"+set.higher(arr[i]));
				list.add(arr[i]);
			}
			set.remove(arr[i]);
		}
          
          System.out.println(set);
          return list;
      }
    
    public static void main(String[] args) {
    	int  arr[] = {2, 6, 9, 1, 3, 2};
    	ArrayList<Integer> findLeastGreater = findLeastGreater(arr.length, arr);
    	System.out.println(findLeastGreater);

	}

}
