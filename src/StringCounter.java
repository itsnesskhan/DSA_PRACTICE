import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class StringCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this this is my given is is string so is";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] srr = s1.split("\\s");
		int count = 0;
		for (int i = 0; i < srr.length; i++) {
			if(map.containsKey(srr[i])) {
				count = map.get(srr[i]);
						System.out.println(count);
				map.put(srr[i], count+1);
		}
		else {
			map.put(srr[i], 1);
		}
	
		}
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e);
		}
	}


}
