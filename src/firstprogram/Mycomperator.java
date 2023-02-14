package firstprogram;

import java.util.Comparator;

public class Mycomperator implements Comparator<int[]> {

	@Override
	public int compare(int[] thi, int[] that) {
//		if (o1[0] == o2[0]) {
//			return o1[1] -o2[1];
//		}
//		return o1[0]-o2[0];
		
		if (thi[0]>that[0]) {
			return 1;
		}
		else if (thi[0]<that[0]) {
			return -1;
		}
		else {
			return thi[1]-that[1];
		}
	}

}
