import java.util.Scanner;

public class Factorial {
	public static int Fact(int num) {
		int fact =1;
		for(int i =1;i<= num;i++) {
			System.out.println();
			
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String []args) {
		System.out.println("Enter the number you wanna know factorial of");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Fact(num));
		
		
	}

}
