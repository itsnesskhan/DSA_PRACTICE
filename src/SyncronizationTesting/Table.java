package SyncronizationTesting;

public class Table {

	public static synchronized void printTable(int n) {
		for (int i = 1; i < 11; i++) {
			System.out.println(n*i);
		}
	}
}
