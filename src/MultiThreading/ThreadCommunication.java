package MultiThreading;

public class ThreadCommunication implements Runnable {
	int total;
	private static final int TICKET_PRICE = 100;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total = total+TICKET_PRICE;
			}
			this.notify();
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadCommunication threadCommunication = new ThreadCommunication();
		Thread thread = new Thread(threadCommunication);
		thread.start();
		synchronized (thread) { // main thread got the lock
			System.out.println(Thread.currentThread().getName());
			thread.wait(); 
		}
		System.out.println("Total amount earned " +threadCommunication.total);
//		Thread.sleep(1000); not racommded to do
//		System.out.println("Total amount earned " +threadCommunication.total);
	}

}
