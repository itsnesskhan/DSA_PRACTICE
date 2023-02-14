
public class MySyncronisation  {
	synchronized void printTable(int n) {
		for (int i = 0; i < 11; i++) {
			System.out.println(n*i);
		}
	}
}
