package javaConcepts;

public class AccessModProt {

	public static void main(String[] args) {

//		new testOne().display();

		AccessModProt objj = new AccessModProt();
		System.out.println("Objj: " + objj);

		System.gc();

		System.out.println("Objj: " + objj);

//		new testOne().display2();

	}

	protected void displayInternal() {
		System.out.println("I am in a protected method");
	}

	public void displayInternalUnprot() {
		System.out.println("I am in a protected method");
	}

}

class testOne {

	protected void display() {
		System.out.println("I am in a protected method");
	}

	private void display2() {
		System.out.println("I am in a protected method");
	}

}
