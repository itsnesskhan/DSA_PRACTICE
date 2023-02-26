package com.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;

	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}

class Student {
	private String name;
	private int age;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers=" + mobileNumbers
				+ "]";
	}

}

class MobileNumber {
	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}

class Address {
	private String zipcode;

	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}

public class StreamTest {

	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		List<Student> students = Arrays.asList(student1, student2, student3);

		// student with name jayesh

//		students.stream().filter(p->p.getName().equals("Jayesh")).forEach(System.out::print);;
		Optional<Student> optional = students.stream().filter(p -> p.getName().equals("Jayesh")).findFirst();
		Optional<Student> optional1 = students.stream().filter(p -> p.getName().equals("mohiy")).findFirst();
		System.out.println(optional.isPresent() ? optional.get().getName() : "Student not found");
		System.out.println(optional1.isPresent() ? optional.get().getName() : "Student not found");

		// studnet with address 1235

		Optional<Student> addressOptional = students.stream().filter(s -> s.getAddress().getZipcode().equals("1235"))
				.findFirst();
		Optional<Student> addressOptional1 = students.stream().filter(s -> s.getAddress().getZipcode().equals("123567"))
				.findFirst();
		System.out.println(addressOptional.isPresent() ? addressOptional.get() : "No student with this address");
		System.out.println(addressOptional1.isPresent() ? addressOptional.get() : "No student with this address");

		// all students with mobile number 3333

		Predicate<List<MobileNumber>> p1 = mlist -> {
			for (MobileNumber mobileNumber : mlist) {
				if (mobileNumber.getNumber().equals("3333")) {
					return true;
				}
			}
			return false;
		};

		List<Student> list = students.stream()
				.filter(stu -> stu.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
				.collect(Collectors.toList());
		System.out.println("***********************************************");
		List<Student> collect9 = students.stream().filter(stu->p1.test(stu.getMobileNumbers())).collect(Collectors.toList());
		System.out.println(collect9);
		System.out.println(list.stream().map(stu -> stu.getName()).collect(Collectors.joining(", ", "{", "}")));
		List<Student> collect = students.stream()
				.filter(stu -> stu.getMobileNumbers().stream().anyMatch(m -> Objects.equals(m.getNumber(), "3333")))
				.collect(Collectors.toList());
		System.out.println(collect.isEmpty() ? "No user with this mobile number" : "");

		// allstudents having mobile number 1233 and 3333
		List<Student> collect2 = students.stream()
				.filter(stu -> stu.getMobileNumbers().stream()
						.allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());
		System.out.println(collect2.stream().map(stu -> stu.getName()).collect(Collectors.joining(", ", "{", "}")));

		// Create a List<Student> from the List<TempStudent>

		TempStudent tempStudent = new TempStudent("Nasser Khan", 23, new Address("454449"),
				Arrays.asList(new MobileNumber("9713216901"), new MobileNumber("7987670697")));
		TempStudent tempStudent2 = new TempStudent("Hamda Khan", 27, new Address("452001"),
				Arrays.asList(new MobileNumber("9494949409"), new MobileNumber("6759670697")));
		TempStudent tempStudent3 = new TempStudent("Zoya Sheikh", 25, new Address("495543"),
				Arrays.asList(new MobileNumber("9713245671"), new MobileNumber("9859670697")));

		List<TempStudent> asList = Arrays.asList(tempStudent, tempStudent2, tempStudent3);
		
//		List<Student> collect10 = asList.stream().map(temp->new Student(temp.name,temp.age,temp.address, temp.mobileNumbers)).collect(Collectors.toList());

		Function<TempStudent, Student> function = stu -> {
			return new Student(stu.name, stu.age, stu.address, stu.mobileNumbers);
		};

		List<Student> list2 = asList.stream().map(function).collect(Collectors.toList());
		System.out.println(list2);

		// Convert List<Student> to List<String> of student name
		String collect3 = students.stream().map(stu -> stu.getName()).collect(Collectors.joining(", ", "[", "]"));
		List<String> collect4 = students.stream().map(stu -> stu.getName()).collect(Collectors.toList());

		System.out.println(collect3);

		// to uppercase

		students.stream().map(stu -> stu.getName().toUpperCase()).forEach(System.out::println);

		// sorting
		// condition
		boolean flag = true;
		List<String> nameList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		if (flag) {

			String collect5 = nameList.stream().sorted().collect(Collectors.joining(", "));
			System.out.println(collect5);
		}
		
	}

}
