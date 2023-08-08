package com.java.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertNumberIntoString {
	
	public static boolean checkPalindrome(int number) {
		int orginalNumber = number;
		int r = 0;
		int revNum =0;
		while(number !=0) {
			r = number%10;
			revNum = revNum*10 +r;
			number = number/10;
		}
		return orginalNumber == revNum;
	}

	public static void main(String[] args) {
		long mobile = 9713216901L;
		String string = String.valueOf(mobile);
		System.out.println(string+" "+string.getClass());
		System.out.println(checkPalindrome(121));
		
		
		int arr[] = {11,23,45,32,43,36};
		Arrays.stream(arr).forEach((e)-> System.out.print(e%10 + e/10+", "));
		System.out.println();
		
		int arr2[] = {10,10, 23,44,29,40,40, 34, 22};
		Map<Integer,Long> collect = Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting()));
		Set<Integer> keySet = collect.keySet();
		for (Integer integer : keySet) {
			if(collect.get(integer)==1) {
				System.out.println(integer); 
			}
		}
		System.out.println(collect);
		
	}
	
}
