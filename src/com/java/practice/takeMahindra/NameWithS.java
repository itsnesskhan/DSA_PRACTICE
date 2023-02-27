package com.java.practice.takeMahindra;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameWithS {

	public static void main(String[] args) {
		List<String> list = List.of("Nasser", "Sahil", "Mohit", "Shireen", "sailesh");
		List<String> collect = list.stream().filter(item-> item.startsWith("S")).collect(Collectors.toList());
		System.out.println();
		System.out.println(collect);
		
		System.out.println("**********************************************");
		
		List<String> list2 = list.stream().filter(item-> item.substring(0,1).equalsIgnoreCase("s")).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("***********************************************");
		
		
		List<String> list3 = List.of("Apple", "Mango","Banana","Banana", "Apple","Apple");
		Map<String,Long> collect2 = list3.stream().collect(Collectors.groupingBy(item->item, Collectors.counting()));
		System.out.println(collect2);
		
		System.out.println("***********************************************");
		
		System.out.println("No duplicates");
		list3.stream().distinct().forEach(System.out::println);
		
		System.out.println("***********************************************");
	}
}
