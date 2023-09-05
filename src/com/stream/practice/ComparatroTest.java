package com.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatroTest {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango","Manga");
		
//		first comparator
		Comparator<String> firstComparator = (s1, s2) -> (s1.length() > s2.length()) ? -1
				: (s1.length() < s2.length()) ? 1 : 0;
//		second comparator
		Comparator<String> secondComparator = (s1, s2)-> (s1.length() > s2.length())?-1:(s1.length()<s2.length())?1:(s1.compareTo(s2));
		
//		third comparator
		Comparator<String> thirdcomparator = (s1, s2) -> s1.compareTo(s2);
		
		System.out.println("sorting without comparator");
		
		String collect5 = nameList.stream().sorted().collect(Collectors.joining(", "));
		System.out.println(collect5);
		
		System.out.println("************************************");
		
		System.out.println("sorting with comparator 1");
		String collect1 = nameList.stream().sorted(firstComparator).collect(Collectors.joining(", "));

		System.out.println(collect1);
		System.out.println("*********************************");
		
		System.out.println("sorting with comparator 2");
		String collect2 = nameList.stream().sorted(secondComparator).collect(Collectors.joining(", "));

		System.out.println(collect2);
		System.out.println("*********************************");
		
		System.out.println("sorting with comparator 3");
		String collect3 = nameList.stream().sorted(thirdcomparator).collect(Collectors.joining(", "));

		System.out.println(collect3);
		System.out.println("*********************************");
		
		List<String> asList2 = Arrays.asList("AA", "AABC","AAABC","ACA","AABC","AAA");
		
		System.out.println("sorting without comparator");
		String collect6 = asList2.stream().sorted().collect(Collectors.joining(", "));
		System.out.println(collect6);
		System.out.println("*********************************");
		
		System.out.println("sorting with comparator 1");
		String collect7 = asList2.stream().sorted(firstComparator).collect(Collectors.joining(", "));
		System.out.println(collect7);
		System.out.println("*********************************");
		
		System.out.println("sorting with comparator 2");
		String collect10 = asList2.stream().sorted(secondComparator).collect(Collectors.joining(", "));
		System.out.println(collect10);
		System.out.println("*********************************");
		
		System.out.println("sorting with comparator 3");
		String collect8 = asList2.stream().sorted(thirdcomparator).collect(Collectors.joining(", "));
		System.out.println(collect8);
		System.out.println("*********************************");
		
	}
}
