import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
	public static void binarySearch(int[] list, int findme) {
		int low = 0;
		int high = list.length - 1;
		int middle = (low + high) / 2;
		while (low<=high) {
			if (list[middle]<findme) {
				low = middle+1;
			}
			else if (list[middle] == findme) {
				System.out.println("element found at"+middle);
				break;
			}
			else {
				high = middle-1;
			}
			
			middle= (low+high)/2;
		}
		if (low>high) {
			System.out.println("elemetn not found");
		}
		
		
		
	}
	
	
	
    static int minSubset(int[] Arr,int N) { 
        int sum =0;
        int temp =0;
        int count =0;
        Arr = Arrays.stream(Arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(e->e.intValue()).toArray();
        for (int i = 0; i < Arr.length; i++) {
			sum+=Arr[i];
		}
        for (int i = 0; i < Arr.length; i++) {
			temp = Arr[i];
			sum= sum-Arr[i];
			if (temp>sum) {
				count++;
			}
		}
        
        return count;
        
    }
    static int inSequence(int A, int B, int C){
    	if(B%C==A) {
    		return 1;
    	}
    	
      return 0;  
    }
    
    static int maxLen(int arr[], int n)
    {   int sum=0;
        int res=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
//        System.out.println(sum);
        for(int i=n-1;i>=0;i--){
            sum-=arr[i];
            count++;
            System.out.println(sum);
            if(sum==0){
                return n-count;
            }
        }
        return n;
        
    }


	public static void main(String[] args) {
		int[] arr = {12,15,5,5,76,3};
		String[] arr2 = {"AABC","ABC","AA","AA","ACA"};
		System.out.println("woriking");
//		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		Arrays.sort(arr2,(a,b)->{
			if(a.length()>b.length()) {
				return 1;
			}
			else if(a.length()<b.length()) {
				return -1;
			}
			return a.compareTo(b);
		});
		
//		System.out.println(Arrays.toString(arr2));
//		binarySearch(arr,12 );
//		System.out.println(inSequence(-2, -9, 7));
		System.out.println(-9%7);
		int arr4[] = {15,-2,2,7,1,-8,10,23};
		System.out.println(maxLen(arr4, arr4.length));
	}
}
