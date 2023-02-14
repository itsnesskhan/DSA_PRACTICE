package com.Collections;

public class Testing {

	int lenth;
	int width;
	int hight;

	@Override
	public String toString() {
		return "ClassObjCheck [lenth=" + lenth + ", width=" + width + ", hight=" + hight + "]";
	}
	
	public static void main(String[] args) {
		int nes = 3;
		int minimum =0;
		for (int i = nes; i < nes*10; i+=nes) {
			if (i%nes ==0) {
				if (minimum<i) {
					minimum = i;
				}
			}
		}
		String valueOf = String.valueOf(minimum);
		char[] charArray = valueOf.toCharArray();
		int sum = 0;
//		for (char c : charArray) {
//			sum+=Character.getNumericValue(c);
//		}
//		System.out.println(sum);
//		System.out.println(5%9);
		int num =3;
		for (int i = 10; i <= 99; i++) {
			if (i%num==0) {
				sum++;
			}
			
		}
		
		System.out.println(sum);
	}

}
