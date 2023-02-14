package firstprogram;

import java.util.Arrays;
import java.util.Collections;

/*
Time Complexity : O(N)
Space Complexity : O(1)

Where 'N' is the number given.
*/

public class SumorProduct {

public static long sumOrProduct(long n, long q) {
	int arr[] = {1,2,2};
	int frequency = Collections.frequency(Arrays.asList(arr), 2);

	long answer = 0;
	long mod = (long)1e9 + 7;

	if (q == 1) {
		/*
			Sum of first 'N' numbers is given by
			'N' * 'N + 1' / 2.
		*/
		answer = (n * (n + 1)) / 2 ;
	} else {
		answer = 1 ;
		for (int i = 1 ; i <= n ; i++) {
			// Modular Arithmatic.
			i %= mod;
			answer %= mod ;
			answer = (answer * i) % mod;
		}
	}

	return answer;

}

public static void main(String[] args) {
	long sumOrProduct = sumOrProduct(15, 2);
	System.out.println(sumOrProduct);
}
}
