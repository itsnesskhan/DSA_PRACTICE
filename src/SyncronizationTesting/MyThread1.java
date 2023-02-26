package SyncronizationTesting;

public class MyThread1 implements Runnable {

	private Table table;

	public MyThread1(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(5);

	}

}
