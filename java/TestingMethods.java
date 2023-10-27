
public class TestingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(122);
//		Derived b = new DeriDerived();
		TestingMethods test = new TestingMethods();
//        test.print(10);

		String s1 = "Hello";
		String s2 = new String("Hello");
		s2 = s2.intern();
		System.out.println(s1 == s2);

	}

	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long i) {
		System.out.println("long");
	}

}

class Base {
	public Base() {
		System.out.println("Base");
	}

	private void BaseMeth() {
		System.out.println("BaseMeth");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}

//	public void BaseMeth() {

//	private void BaseMeth() {

	public void BaseMeth() {
		System.out.println("hi");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {
		System.out.println("DeriDerived");
	}
}
