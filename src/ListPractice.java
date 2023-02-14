import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPractice {
	 public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(34);
		list.add(7);
		list.add(89);
//		String string="";
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i)%2==0) {
//				string+="E"+list.get(i)+" ";
//			}
//			else {
//				
//				string+="O"+list.get(i)+" ";
//			}
//		}

//		System.out.println(string);
		
		String collect = list.stream().map(i-> i%2== 0? "E"+i+" ":"O"+i+" ").collect(Collectors.joining(","));
		System.out.println(collect);
}
		
}
