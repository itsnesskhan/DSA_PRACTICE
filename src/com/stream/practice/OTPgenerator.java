package com.stream.practice;

import java.util.function.Supplier;

public class OTPgenerator {
	
	private static final int OTP_LENGTH =4;

	public static void main(String[] args) {
		
		Supplier<String> supplier =()->{
			String otp="";
			for (int i = 0; i <OTP_LENGTH ; i++) {
				  otp+=(int)(Math.random()*10);
			}
			
			return otp;};
		System.out.println(supplier.get());
	}

}
