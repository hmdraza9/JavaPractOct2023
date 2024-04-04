package my.test.pack.javaConcepts;

public class ExampleP {

	public int a = 10;
	public int b = 9;

	ExampleP(int a, int b) {
		this.a = a;
		this.b = b;
	}

	private void add() {
		System.out.println(a + b);
	}

	public static void mainExamp8p() {

		Examp8C e = new Examp8C(15, 10);
		e.add();

		ExampleP f = new Examp8C(15, 10);
		f.add();

	}

}

class Examp8C extends ExampleP {

	public Examp8C(int a, int b) {

		super(a, b);
	}

	protected void add() {
		System.out.println(a * b);
	}
}