package com.java.practice.takeMahindra;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class MyThread1 extends Thread{

	MyMap myMap;
	
	@Override
	public void run() {
		myMap.map.put("insert", 5);
	}

	public MyThread1(MyMap myMap) {
		super();
		this.myMap = myMap;
	}
	
	
	
	
	
}

class MyThread2 extends Thread{

	MyMap myMap;
	
	
	
	public MyThread2(MyMap myMap) {
		super();
		this.myMap = myMap;
	}



	@Override
	public void run() {
		myMap.map.put("insert2", 5);
	}
	
	
}

class MyMap{
	
//	ConcurrentHashMap<String,Integer> map;
	HashMap<String,Integer> map;

	public MyMap(HashMap<String, Integer> map) {
		super();
		this.map = map;
	}

	
		
}

public class ThreadAccessToHashMap {
	

	public static void main(String[] args) {
//		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String, Integer>();
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("Nasser", 1);
		map.put("mohit", 2);
		map.put("ayush", 3);
		map.put("rohit", 4);
		map.put("akshay", 5);
		MyMap myMap = new MyMap(map);
		MyThread1 thread1 = new MyThread1(myMap);
		MyThread2 myThread2 = new MyThread2(myMap);
		thread1.start();
		myThread2.start();
		
		System.out.println(map);
}
}