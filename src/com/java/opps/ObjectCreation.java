package com.java.opps;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test implements Cloneable{
	String string = "Nasser";

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ObjectCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
//		first way
		Test test = new Test();
		System.out.println(test.string);
		
//		second way
		Test newInstance = Test.class.newInstance();
		System.out.println(newInstance.string);
		
//		third way
		Constructor<Test> constructor = Test.class.getConstructor();
		Test newInstance2 = constructor.newInstance();
		System.out.println(newInstance2.string);
		
//		forth way
		Test newinstance3 = (Test)test.clone();
		System.out.println(newinstance3.string);
		
//		fith way
//		serialization desiralization
		
		
	}
	
}
