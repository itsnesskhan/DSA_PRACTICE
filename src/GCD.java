
public class GCD {
	public static int findGCD(int num1, int num2) {
		if (num2==0) {
			return num1;
		}
		return findGCD(num2, num1%num2);
	}
	
	public static void main(String[] args) {
		System.out.println(findGCD(9, 18));
//		System.out.println(16%70);
//		System.out.println(70%16);
//		System.out.println(8%3);
//		System.out.println(15%35);
//		System.out.println(15%37);
	}
}
