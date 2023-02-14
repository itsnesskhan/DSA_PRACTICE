package com.DSA;

import java.util.HashMap;

public class FirstKTimeElementInArray {

	
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
			if (map.get(i)==k ) {
				return i;
			}
		}
        return -1;
    }
    
    public static void main(String[] args) {
		FirstKTimeElementInArray frInArray = new FirstKTimeElementInArray();
		int A[] = {1, 7, 4, 3, 4, 8, 7};
		int firstElementKTime = frInArray.firstElementKTime(A, A.length, 2);
		System.out.println(firstElementKTime);
	}
}
