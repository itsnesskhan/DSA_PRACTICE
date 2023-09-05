package SyncronizationTesting;

public class TestSycronization {

	public static void main(String[] args) {
		Table table = new Table();
		Table table2 = new Table();
		MyThread1 myThread1 = new MyThread1(table);
		MyThread2 myThread2 = new MyThread2(table2);
		
		Thread thread = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread.start();
		thread2.start();
		
	}
}
