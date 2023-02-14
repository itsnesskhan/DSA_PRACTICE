import java.util.Scanner;

public class ifelse {
	public static void main(String [] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n%2 == 0){
			System.out.println(n);
			if(n>=2 & n<=5){
				System.out.println("Not Weird");
			}
			else if (n>=6 & n<=20) {
				System.out.println("Weird");
				
			}
			else if(n>20){
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}

}