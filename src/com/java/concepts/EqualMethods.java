package com.java.concepts;

class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}

public class EqualMethods {

	public static void main(String[] args) {
		String string = new String("hello");
		String string2 = new String("hello");

		System.out.println(string == string2); // false
		// cause both pointing to diffrent memory locations

		System.out.println(string.equals(string2));

		Dog dog = new Dog("saklen");
		Dog dog1 = new Dog("saklen");
		System.out.println(dog1 == dog);
		System.out.println(dog.equals(dog1)); // we dont have not define equals method in the dog class, so it is
												// calling the parent's equals method which is basically == comparision
	}
}
