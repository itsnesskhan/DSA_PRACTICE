package SyncronizationTesting;

class A {

	private B b;

	public synchronized void D1(B b) {
		System.out.println("main thread starts execution of d1");
		this.b = b;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread trying to call b's last method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("inside a, last method");
	}

}
class B  {

	private A a;

	public synchronized  void D2(A a) {
		this.a = a;
		System.out.println("child starts execution of d2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread trying to call a's last method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("inside b, last method");
	}

	

}

public class Deadlock extends Thread {
	
	 A a=  new A();
	 B b = new B();
	 
	 public void m1() {
		 System.out.println(Thread.currentThread().getName());
		 this.start(); // call by main method
		 a.D1(b); // this line executeted by main thread
		 
	 }

	public void run() {
		b.D2(a); // this line exeucted by child thread
		
	}
	
	public static void main(String[] args) {
		Deadlock deadlock = new Deadlock();
		deadlock.m1();
	}

}
