package Exceptions;

public class TestExceptionsPract {

	static {
		System.out.println("I am in first blank static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestExceptionsPract.throwTest();

	}
	static {
		System.out.println("I am in second blank static block");
	}
	
	public static void throwTest() {
		
		try {
			throw new Child();
		}
		catch(Child b) {
			System.out.println("Caught Child class exception");
		}
		catch(Base b) {
			System.out.println("Caught Base class exception");
		}
	}

}


class Base extends Exception{}
class Child extends Base{}