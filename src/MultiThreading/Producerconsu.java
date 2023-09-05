package MultiThreading;

import java.util.Iterator;

class ProductEx{
	
	int element;
	boolean flag = false;
	
	public synchronized void produceElement() throws InterruptedException {
		if (flag) {
			wait();
		}
		
		System.out.println(Thread.currentThread().getName());
		if (element ==0) {
			element = 1;
			System.out.println("element produced "+ element);
			flag = true;
			notify();
			
		}
	}
	
	public synchronized void consumeElement() throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println(Thread.currentThread().getName());
		if(element!=0) {
			element = 0;
			System.out.println("element consumed "+element);
			flag = false;
			notify();
		}
	}
}

class ProduceThread implements Runnable{
	
	private ProductEx productEx;


	public ProduceThread(ProductEx productEx) {
		super();
		this.productEx = productEx;
	}



	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				productEx.produceElement();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class ConsumeThread implements Runnable{
	
	private ProductEx productEx;
	

	public ConsumeThread(ProductEx productEx) {
		super();
		this.productEx = productEx;
	}



	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				productEx.consumeElement();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


public class Producerconsu {
	public static void main(String[] args) throws InterruptedException {
		ProductEx productEx = new ProductEx();
		ProduceThread produceThread = new ProduceThread(productEx);
		ConsumeThread consumeThread = new ConsumeThread(productEx);
		
		Thread thread = new Thread(produceThread);
		thread.setName("Nasser");
		Thread thread2 = new Thread(consumeThread);
		thread2.setName("Hamda");
		
		thread.start();
//		thread.join();
		thread2.start();
	}

}
