package MultiThreading;

public class LicenseExample {

	public static class MedicalTest implements Runnable {

		@Override
		public void run() {
			System.out.println("Medical test started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Medical test ended");
		}

	}

	public static class DrivingTest implements Runnable {

		@Override
		public void run() {
			System.out.println("Driving test started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Driving test Completed");

		}

	}

	public static class OfficerSign implements Runnable {

		@Override
		public void run() {
			System.out.println("Went to officer office");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("got the officer sign");
			System.out.println("Congratulations, you got your driving license");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		MedicalTest medicalTest = new MedicalTest();
		DrivingTest drivingTest = new DrivingTest();
		OfficerSign officerSign = new OfficerSign();
		
		Thread thread = new Thread(medicalTest);
		Thread thread2 = new Thread(drivingTest);
		Thread thread3 = new Thread(officerSign);
		
		thread.start();
		thread.join(); //main thread get into waiting state so other thread wont execute
		thread2.start();
		thread2.join();
		thread3.start();
	}
}
