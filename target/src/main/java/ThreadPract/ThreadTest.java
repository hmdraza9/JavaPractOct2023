package ThreadPract;

public class ThreadTest {

	public static void main(String[] args) {
//		Thread myThread = new MyThread();
//		myThread.run(); // #1
//		System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
		
		testStringIntern obj = new testStringIntern();
		obj.compStrings();
//		String s = new String("5");
//        System.out.println(1 + 10 + s + 1 + 10);
//        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
	}
}



class testStringIntern{
	
	public void compStrings() {
		
		String s1 = "hello";
		
		String s2 = "hello";
		
		String s3 = "hello";
		
		String s4 = new String("hello");
		
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		
		System.out.println("s2.equals(s3): "+s2.equals(s3));
		
		System.out.println("s2.equals(s4): "+s2.equals(s4));

		
		System.out.println("s1==s2: "+(s1==s2));
		
		System.out.println("s1==s3: "+(s1==s3));
		
		System.out.println("s2==s3: "+(s2==s3));
		
		System.out.println("s2==s4): "+(s2==s4));

		
		s4 = s4.intern();
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		
		System.out.println("s2.equals(s3): "+s2.equals(s3));
		
		try {
			System.out.println("s2.equals(s4): "+s2.equals(s4));
		} finally {
			System.out.println("efjhds");
		}
		
		
		
	}
	
	
}