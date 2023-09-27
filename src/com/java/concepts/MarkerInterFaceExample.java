package com.java.concepts;

interface IDiscount {

}
class DiscountUtils {

	public static boolean isDiscountEligible(Object object) {
		if (object instanceof IDiscount) {
			return true;
		}
		return false;
	}

}

class Student implements IDiscount {
	private Integer id;
	private String name;
	private String city;
}

public class MarkerInterFaceExample {
	public static void main(String[] args) {
			boolean discountEligible = DiscountUtils.isDiscountEligible(new Student());
			System.out.println(discountEligible);
	}

}
