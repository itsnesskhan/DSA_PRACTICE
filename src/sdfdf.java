import java.util.Scanner;

public class sdfdf {
	public static void main(String[] args) {
		System.out.println("Enter the number you wanna print table of");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i =0;i<10;i++) {
			System.out.println(num+"X"+i+" = "+num*i);
		}
	}

}

