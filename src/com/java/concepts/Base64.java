package com.java.concepts;

import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64 {

	public static void main(String[] args) {
		String crediantial = "Nasser Khan";
		Encoder encoder = java.util.Base64.getEncoder();
		String encodeToString = encoder.encodeToString(crediantial.getBytes());
		System.out.println("original string "+crediantial);
		System.out.println("incoded string "+ encodeToString);
		Decoder decoder = java.util.Base64.getDecoder();
		byte[] decode = decoder.decode(encodeToString.getBytes());
		String decodedstring = new String(decode);
		System.out.println(decodedstring);
		
		//same we can do for url
	}
}
