package com.java.concepts;
import java.util.*;
import java.util.Map.Entry;

public class hashmap{
    public static void main(String[] args){
	  HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Nasser", 101);
		map.put("mohit", 102);
		map.put("rose", 103);
		int count=0;
//		for(int i=0;i<1000000;i++) {
//			map.put("nass"+count, 101);
//			count++;
//		}
		System.out.println(map.size());
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet){
			System.out.println("Key: "+entry.getKey()+" and Value: "+entry.getValue());	
			if(entry.getKey() =="Nasser") {
//				map.remove(entry.getKey()); // will throw concurrent modification exception
			}
		}
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			
			Entry<String, Integer> current = iterator.next();
			if(current.getKey()=="Nasser") {
				iterator.remove();
			}
		}
		
		System.out.println(map);
	}
}