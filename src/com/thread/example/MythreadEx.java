package com.thread.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class MythreadEx extends Thread{

	@Override
	public void run() {
		List<String> arrayList = List.of("Nasser", "aamir","ali","abhi","aahil","rohit");
		List<String> collect = arrayList.stream().filter((e)->e.startsWith("a")).filter((e)->e.length()==3) .collect(Collectors.toList());
		System.out.println(this.getName());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nasser Khan"+i);
		}
	}

}
