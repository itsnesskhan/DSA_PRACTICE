package MultiThreading;


public class TestingJoin implements Runnable {
	private static Thread mainThread;

	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("i am "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		mainThread = Thread.currentThread();
//		System.out.println(mainThread);
		TestingJoin testingJoin = new TestingJoin();
		Thread thread = new Thread(testingJoin);
		thread.start();
//		thread.join();
		for (int i = 0; i < 5; i++) {
			
			System.out.println("i am "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		
	}

}
