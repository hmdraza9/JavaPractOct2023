package my.test.pack.javaConcepts;

class MutliThreadDemo extends Thread {

	public void run() {
		try {
			System.out.println("Thread is running: " + Thread.currentThread().getId());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

public class MultithreadExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			new MutliThreadDemo().start();
		}

	}

}