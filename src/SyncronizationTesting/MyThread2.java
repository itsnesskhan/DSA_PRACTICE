package SyncronizationTesting;

public class MyThread2 implements Runnable {

	private Table table;

	public MyThread2(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(10);

	}

}
