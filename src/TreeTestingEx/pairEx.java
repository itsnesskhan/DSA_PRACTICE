package TreeTestingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairEx{
	    public static int[][] pairSum(int[] arr, int s) {
	        
	                List<int[]> ans = new ArrayList();
	        
	        for(int i=0;i<arr.length;i++){
	            for( int j=i+1;j<arr.length;j++){
	                if(arr[i]+arr[j]==s){
	                    int[] pair = new int[2];
	                    pair[0] = arr[i];
	                    pair[1] = arr[j];
	                    ans.add(pair);

	                }
	            }
	        }
//	        System.out.println(Arrays.toString(pari));
	         int res[][] = new int[ans.size()][2];
	        for (int i = 0; i < ans.size(); i++) {
	            int a = ans.get(i)[0], b = ans.get(i)[1];
	            res[i][0] = Math.min(a, b);
	            res[i][1] = Math.max(a, b);
	        }
	        return res;
	    }

		
	public static void main(String[] args) {
		    int[] arr = {1 ,2 ,3, 4, 5};
		    int[][] pairSum = pairSum(arr, 5);
		    System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	

}
