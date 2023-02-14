
public class FindFactorial {

	public static int findFact(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println("factorical of number is "+ findFact(8));
	}
}
