package com.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class CountCharUsingMap {
	
	public static void countChar(String string) {
//		String withoutspaceString = string.trim();
//		System.out.println(withoutspaceString);
		char[] chars= string.replaceAll("\\s", "").toUpperCase().toCharArray();
		System.out.println(chars);
//		System.out.println(Arrays.toString(chars));
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c:chars) {
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		String string = "MyNameisNasserKhan";
		countChar(string);
		
//		HashMap<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> hashMap = new WeakHashMap<String, Integer>();
		hashMap.put("Nasser",1998);
		hashMap.put("Hamda",1996);
		hashMap.put("Zoya",1992);
		hashMap.put("Aafiya",2003);
		hashMap.put("Mohit",2019);
		
		Set<Entry<String,Integer>> set = hashMap.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Entry<String, Integer> next = iterator2.next();
			System.out.println(next.getKey());
		}
		
//		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
//		System.out.println(entrySet);
//		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
////			System.out.println(iterator.next());
//			Entry<String, Integer> next = iterator.next();
//			System.out.println(next.getKey());
////			if () {
////				
////			}
//			if (next.getKey()== "Zoya") {
//				iterator.remove();
//			}
//			
//		}
//		
//		
		System.out.println(hashMap);
		
		Set<String> keySet = hashMap.keySet();
		System.out.println(keySet);
//		Collection<Integer> values = hashMap.values();
//		System.out.println(values);
//		Iterator<Integer> iterator = values.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next() ==1998) {
//				iterator.remove();
//			}
//		}
//		System.out.println(values);
		
		Iterator<String> iterator = keySet.iterator();
		System.out.println(keySet);
		while (iterator.hasNext()) {
			if (iterator.next()=="Hamda" ) {
				iterator.remove();
			}
		}
		System.out.println(keySet);
		System.out.println(hashMap);
	}
	
	
	
}
