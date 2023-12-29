package my.test.pack.javaConcepts;

public class InheritCodeReuse extends Parent {
	
	public InheritCodeReuse() {
		super();
		System.out.println("InheritCodeReuse(child) constructor");
		String parName = super.parentRole;
		System.out.println(parName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritCodeReuse obj = new InheritCodeReuse();

		System.out.println(obj.parentName);
		System.out.println(obj.parentRole);
		obj.displayParName();
	}
	public void yy() {
		System.out.println(super.parentRole);
	}

}

class Parent {
	
	public Parent() {
		System.out.println("Parent constructor");
	}

	public String parentName = "Abdul";
	public String parentRole = "Father";

	public void displayParName() {
		System.out.println(parentName);
	}

}