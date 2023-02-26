package com.stream.practice;

import java.util.*;

import javax.lang.model.type.UnionType;

class PhoneBookTable {

	private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {

		private static final long serialVersionUID = 1L;

		{
			put("Jos de Vos", "016/161616");
			put("An de Toekan", "016/161617");
			put("Kris de Vis", "016/161618");
		}
	};

	private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

	PhoneBookTable() {
	}
	
	public static <T extends PhoneBook> void union(List<T> a, List<T> b){
		HashSet<T> hashSet = new HashSet<T>();
		hashSet.addAll(a);
		hashSet.addAll(b);
		new  ArrayList<T>(hashSet);
		
		
	}
	
	

	public HashMap<String, String> getPhoneBookEntries() {
		return phoneBookEntries;
	}

	public Optional<String> findPhoneNumberByName(String name) {
		for (String key : phoneBookEntries.keySet()) {
			if (key.equalsIgnoreCase(name)) {
				return Optional.of(phoneBookEntries.get(key));
			}
		}
		return null;
	}

	public Optional<String> findNameByPhoneNumber(String phoneNumber) {
		for (Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
			if (phoneNumber.equalsIgnoreCase(entry.getValue())) {
				return Optional.of(entry.getKey());
			}
		}
		return Optional.ofNullable(null);
		
//		for(Map.Entry<String, String> meh: phoneBookEntries.entrySet()) {
//			if (phoneNumber.equals(meh.getValue())) {
//				
//			}
//		}
}

	public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name) {
		boolean flag = false;
		for (String key : phoneBookEntries.keySet()) {
			if (key.equalsIgnoreCase(name)) {
				flag = true;
				return phoneBookEntries.get(key);
			}
		}
		if (!flag) {
			System.out.println(phoneBookEntries);
		}

		return null;
	}

	@Override
	public String toString() {
		System.out.println("Hello from PhoneBook's toString method");
		return "PhoneBook{" + "phoneBookEntries=" + phoneBookEntries + '}';
	}

//	@Override
//	public int compareTo(PhoneBookTable that) {
//		 if (this.getPhoneBookEntries().keySet()) {
//			
//		}
//		
//	}
}

public class PhoneBook {
	public static void main(String[] args) {
		PhoneBookTable phoneBookTable = new PhoneBookTable();
		System.out.println(phoneBookTable.getPhoneBookEntries());
//		Optional<String> findPhoneNumberByName = phoneBookTable.findPhoneNumberByName("An de ekan");
//		System.out.println(findPhoneNumberByName);
		System.out.println(phoneBookTable.findNameByPhoneNumber("016/161619"));
//		phoneBookTable.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("");

	}
}