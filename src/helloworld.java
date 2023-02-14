import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world Jizz it's woring");
		int a = 0;
		int b = 1,c =0;
		
		System.out.println("Enter the number you want Fibinocci series upto");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 1) {
			System.out.println(a);
		}
		else {
			System.out.println(a);
			System.out.println(b);
		}
		
		for(int i=2;i<num;i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	}
	
		


