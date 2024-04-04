package my.test.pack.Exceptions;

public class ExceptionsPract {

	static {
		System.out.println("I am in first blank static block");
	}

	public static void mainExceptionPract() {

	}

	static {
		System.out.println("I am in second blank static block");
	}

	public static void throwTest() {

		try {
			throw new ChildException();
		} catch (ChildException c) {
			System.out.println("Caught Child class exception");
		} catch (BaseException b) {
			System.out.println("Caught Base class exception");
		}
	}

}

class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

class ChildException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}