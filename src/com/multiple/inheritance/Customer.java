package com.multiple.inheritance;


import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer<E> implements Airtel,Idea {

	@Override
	public void makeVideoCall() {
		System.out.println("making video call");
		
	}

	@Override
	public void takeCall() {
		Idea.super.takeCall();
	}

	@Override
	public void makeCall() {
		List<Integer> list = List.of(4, 6,43,33,55,34,56);
		List<Integer> list2 = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(list2);
//		list2.stream().map(e->Math.pow(e, 2)).forEach(System.out::println)
		List<Integer> collect = list.stream().map(e->e+5).collect(Collectors.toList());
		System.out.println(collect);

		Idea.super.makeCall();
	}
	
	
	
	

	

		
	


	

	

}
