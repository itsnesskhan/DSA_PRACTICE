import java.util.Iterator;

public class ReverseString {

	public int[] plusTwo(int[] a, int[] b) {
		  int totalLen = a.length* b.length;
		  int arr[] = new int[totalLen];
		  int i=0;
		  for( i=0;i<a.length;i++) arr[i] = a[i];
		  for(int j=i;j<totalLen;j++) arr[j] = b[j];
		  return arr;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this is my java string reverse";
		String revString = "";
		char[] arr = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			revString= arr[i]+revString;
		}
		System.out.println(revString);
		
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		
	}

}
