package javaConcepts;

public class SingletonClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testSingleton w = testSingleton.getInstance();
		testSingleton x = testSingleton.getInstance();
		testSingleton y = testSingleton.getInstance();
		testSingleton z = testSingleton.getInstance();
		System.out.println(w.hashCode());
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
	}

}



class testSingleton {

	private static testSingleton new_instance = null;

	private void testSingleton() {
	}

	public static testSingleton getInstance() {

		if (new_instance == null) {
			new_instance = new testSingleton();
		}
		
		return new_instance;

	}

}