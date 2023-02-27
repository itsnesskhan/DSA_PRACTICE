package MultiThreading;

import java.util.ArrayDeque;
import java.util.Queue;

class Product {
	private int element;
	boolean flag = false;

	public Product() {
	}

	public synchronized void ProduceElement(String s) throws InterruptedException {
		if (flag) {
			wait();
		}
		System.out.println("in producer "+Thread.currentThread().getName());
		if (element==0) {

			element =1;
			System.out.println("Element produced " + element);
			flag = true;
			notify();
		}

	}

	public synchronized void ConsumeElement() throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println("in consumer"+Thread.currentThread().getName());
		if (element!=0) {
			System.out.println("Element consumed " + element);
			element=0;
			flag = false;
			notify();
		}

	}
}

class Producer implements Runnable {

	Product product;

	public Producer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				product.ProduceElement("Nasser" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	Product product;

	public Consumer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				product.ConsumeElement();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumerEx {
	public static void main(String[] args) throws InterruptedException {
		Product product = new Product();
		Producer producer = new Producer(product);
		Consumer consumer = new Consumer(product);

		Thread thread = new Thread(producer);
		Thread thread2 = new Thread(consumer);

		thread.start();
		thread2.start();

//		thread.join();
	}
}
