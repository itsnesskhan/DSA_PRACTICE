package com.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Integer arr[] = {1,45,67,89,23,34,23};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		Optional<String> optional= Optional.ofNullable("");
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("enter uour name"));
		
	}
}
