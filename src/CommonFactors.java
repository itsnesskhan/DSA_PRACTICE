import java.util.HashSet;
import java.util.Set;

public class CommonFactors {
	
	public static int findCommonFactors(int num ,int num2) {
		int count = 1;
		int findGCD = GCD.findGCD(num, num2);
		System.out.println(findGCD);
		for (int i = 2; i <=findGCD; i++) {
			if(num%i ==0 && num2 %i == 0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		return count;
		}
	
	public static void main(String[] args) {
		System.out.println("total factors "+findCommonFactors(56, 8));
	}
	
}
