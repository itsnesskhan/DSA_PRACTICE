package firstprogram;


class Test1 {

	public void getAddition(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void getAddition(int a, int b, int c) {
		int sum = a+b+c;
	}

	
	
}

class Texting extends Bank{
	
	public void getAddition(int a, int b) {
		System.out.println("texting class addition method");
	}
}

public class Bank{
	public static void main(String args[]) {
		Texting texting = new Texting();
		texting.getAddition(5, 6);
	}
}
