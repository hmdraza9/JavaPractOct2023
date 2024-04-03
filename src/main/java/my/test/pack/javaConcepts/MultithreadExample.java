package my.test.pack.javaConcepts;

class MutliThreadDemo extends Thread {

	public void run() {
		try {
			System.out.println("Thread is running: " + Thread.currentThread().getId());
//			sleeping();
//			eating();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void sleeping() {
		System.out.println("Sleeping");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eating() {
		System.out.println("Eating");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class MultithreadExample {

	public static void mainMultithreadExample() {

		for (int i = 0; i < 10; i++) {
			new MutliThreadDemo().start();
			new MutliThreadDemo().sleeping();
			new MutliThreadDemo().eating();
		}

	}

}