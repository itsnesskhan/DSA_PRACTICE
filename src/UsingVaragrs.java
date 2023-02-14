import java.util.Scanner;

public class UsingVaragrs {

	public static void add(int... arr) {
		int sum = 0;
		String string="";
		System.out.println("worikg");
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			string+=arr[i];
			if (i<arr.length-1) {
				string+="+";
				
			}
			
			
		}
		System.out.println(string+"="+sum);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter six elemetns one by one");
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		add(arr);
	}
}
