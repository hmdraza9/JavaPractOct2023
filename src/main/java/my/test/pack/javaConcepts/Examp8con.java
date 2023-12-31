package my.test.pack.javaConcepts;

class Examp8 {

	protected int a = 10;
	public int b = 9;

	protected Examp8(int a, int b) {
		this.a = a;
		this.b = b;
	}

	protected void add() {
		System.out.println(a + b);
	}

}

public class Examp8con extends Examp8 {

	public Examp8con(int a, int b) {

		super(a, b);
	}

	public static void mainExamp8con() {
		// TODO Auto-generated method stub

		Examp8con e = new Examp8con(15, 10);
		e.add();

	}
}