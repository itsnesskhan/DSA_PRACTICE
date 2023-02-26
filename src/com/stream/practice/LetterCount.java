// {
package com.stream.practice;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;

public class LetterCount {
// }

public static long getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
    Function<String, Integer> myfunFunction = s->{
    	int sum = 0;
		sum += s.length();
		return sum;
		};
//		Integer apply = myfunFunction.apply();
//		System.out.println(apply);
		
		int sum = Arrays.stream(names).filter(i->i.length()>5).mapToInt(s->s.length()).sum();
		IntStream mapToInt = Arrays.stream(names).filter(i->i.length()>5).mapToInt(s->s.length());
//		System.out.println("intstream"+mapToInt.toString());
		
		
//     Arrays.stream(names).filter(i->i.length()>5).f
//     System.out.println("streamof int"+map.toString());
//    System.out.println(collect);
	return sum;
}


public static void main(String[] args) {
	System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
	long count = getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
	long count2 = getTotalNumberOfLettersOfNamesLongerThanFive("jones", "aaron", "seppe");
	List<String> of = Arrays.asList("Mohit", "xoya"); //fixed size list throw exeption
	List<String> of2 =Arrays.asList("rohit","aayush");
////	of.addAll(of2);
//	of.add("iqra");
//	System.out.println(of);
//	System.out.println(count);
//	System.out.println(count2);
	List<List<String>> myList = Arrays.asList(Arrays.asList( "mohit","rohit"), Arrays.asList("nasser", "rohit"));
	List<String> collect = myList.stream().flatMap(l1->l1.stream()).collect(Collectors.toList());
	System.out.println(collect);
	List<String> newliStrings  = new ArrayList<String>();
	Function<List<String>, String> f1 = l->{ 
		for (String string :l) {
			
		}
		return null;
	};
	for (List<String> l : myList) {
		for (String string :l) {
			newliStrings.add(string);
		}
	}
	System.out.println(myList);
	System.out.println(newliStrings);
	
	
	
	System.out.println("Testing if [aaron] returns 0");
	
} 
 

 

//{
//}
}
//}
