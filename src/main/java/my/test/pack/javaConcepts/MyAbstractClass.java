package my.test.pack.javaConcepts;

public abstract class MyAbstractClass {

	public static int year;
	public int month;

	public static void myAbsStaticMethod() {
		System.out.println("ABS - In Abs class static medthod");
	}

	public MyAbstractClass(int month) {
		this.month = month;
	}

	public abstract void hellManAbs();

	public void hellWomanAbs() {
		System.out.println("ABS - I am i hell woman method.");
	}
}
