package com.java.practice.takeMahindra;

public class RemoveVowelThenReverse {

	public static String removeVowel(String str) {
		String vowels = "aeiou";
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'I' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				continue;
			}
			else {
				result+=str.charAt(i);
			}
		}
		return result;
	}
	
	public static String removeVowel2(String str) {
		String replaceAll = str.replaceAll("[aeiouAEIOU]", "");
		String result= "";
		for (int i = 0; i < replaceAll.length(); i++) {
			result = replaceAll.charAt(i)+result;
		}
		
		return result;
	}
	
	private static void replaceStringWithoutThirdVariable(String str1, String str2) {
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length() -str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		String str = "Ishika";
		System.out.println(removeVowel(str));
		System.out.println(removeVowel2(str));
		replaceStringWithoutThirdVariable("Nasser","Khan");
		
	}


	
}
