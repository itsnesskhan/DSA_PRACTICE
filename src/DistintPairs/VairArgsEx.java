package DistintPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VairArgsEx {
	static int sum;
	
	public static int getAddition(int ...a) {
		sum =0;
		for (int i : a) {
			sum+=i;
		}
		System.out.println("Addition is :"+sum);
		return sum;
	}
	
    static int remove_duplicate(int A[],int N){
        int count = 0;
        for(int i=0;i<N-1;i++){
            int j= i+1;
            if(A[i]==A[j]){
                continue;
            }
            count++;
            j++;
            
        }
        
        return count;
      }
    
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
    	int count =0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<Q;++i){
        	int length = query[i].length();
            for(int j=0;j<Q;j++){
            	
                if (length<=li[j].length() && li[j].substring(0, length).compareTo(query[i])==0) {
                	count++;
				}
            }
            list.add(count);
            count=0;
        }
        return list;
    }
	
	public static int getDivision(Integer ...a) {
		sum = 0;
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		for (int i : a) {
			sum = i-sum;
		}
		System.out.println("Division is :"+sum);
		return sum;
	}
	
	public static void main(String[] args) {
//		getAddition(1,4,6,7,8);
//		getAddition(1,4);
//		getAddition(1,4,8,567);
//		getDivision(3,7);
//		getDivision(3,5,8,0);
//		
//		int arr[] = {1,2,2};
//		int remove_duplicate = remove_duplicate(arr, 3);

		String	li[] = {"abracadabra", "geeksforgeeks", 
			      "abracadabra", "geeks", "geeksthrill"};
		String	query[] = {"abr", "geeks", "geeksforgeeks", 
			         "ge", "gar"};

		List<Integer> prefixCount = prefixCount(li.length, query.length, li, query);
		System.out.println(prefixCount);
	}

}
