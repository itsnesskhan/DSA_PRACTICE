import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompateObjects {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Nasser"));
		list.add(new Student(2, "Zoya"));
		list.add(new Student(3, "Hamda"));
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
	}
}
