package firstprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrimeNumber {
	
    private static final int Integer = 0;



	static int majorityElement(int a[], int size)
    {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
				
			}
			else {
				map.put(a[i], 1);
			}
		}
        
       
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		if (entry.getValue()>size/2) {
			return entry.getKey();
		}
	}
        return -1;
    }
    
    

	public static void main(String []args ) {
		System.out.println("Enter a nuber to check");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int flag = 0;
//		if(num == 0 || num ==1) {
//			System.out.println("Not a prime number");
//			
//		}
//		else{
//			for(int i=2;i<num;i++) {
//				if(num%i == 0) {
//					System.out.println("Not a prime number");
//					flag = 1;
//					break;
//			
//				}
//			}
//		}
//		if(flag ==0) { System.out.println(num+"is prime number");}
		int[] ar = {4,7,8,4,4};
		System.out.println(majorityElement(ar, 5));
	}
	
	
}
