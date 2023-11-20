package javaConcepts;

public class SingletonClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Single tone class");
		testSingleTon w = testSingleTon.getInstance();
		System.out.println(w.hashCode());
		testSingleTon x = testSingleTon.getInstance();
		System.out.println(x.hashCode());
		testSingleTon y = testSingleTon.getInstance();
		System.out.println(y.hashCode());
		testSingleTon z = testSingleTon.getInstance();
		System.out.println(z.hashCode());

		System.out.println("\n\nTwo tone class");
		testTwoTon a = testTwoTon.getInstance();
		System.out.println(a.hashCode());
		testTwoTon b = testTwoTon.getInstance();
		System.out.println(b.hashCode());
		testTwoTon c = testTwoTon.getInstance();
		System.out.println(c.hashCode());
		testTwoTon d = testTwoTon.getInstance();
		System.out.println(d.hashCode());
	}

}

class testSingleTon {

	private static testSingleTon new_instance = null;

	private void testSingleTon() {
	}

	public static testSingleTon getInstance() {

		if (new_instance == null) {
			new_instance = new testSingleTon();
		}

		return new_instance;

	}

}

class testTwoTon {

	private static testTwoTon new_instance = null;
	private static final int objCountLimit = 2;
	private static int objCount = 1;

	private void testTwoTon() {
	}

	public static testTwoTon getInstance() {

		if (new_instance == null || objCount <= objCountLimit) {
			new_instance = new testTwoTon();
			System.out.println("objCount: " + (objCount++));
		}

		return new_instance;

	}

}