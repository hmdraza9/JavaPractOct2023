package mainPackageRunner;

import my.test.pack.javaConcepts.MyAbstractClass;
import my.test.pack.javaConcepts.MyInterface;

public class JavaMAINClass2 {

	public static void main(String[] args) {

		System.out.println("MyInterface.age: " + MyInterface.age);
		MyInterface.greet();
		MyInterface myIn = new MyInterface() {

			@Override
			public void hellmanInt() {
				System.out.println("Int - I am i hell man method.");
			}
		};

		myIn.hellmanInt();

		MyAbstractClass.myAbsStaticMethod();

		System.out.println("MyAbstractClass.year before init: " + MyAbstractClass.year);

		MyAbstractClass myAb = new MyAbstractClass(12) {

			@Override
			public void hellManAbs() {

			}

		};
		MyAbstractClass.year = 2024;
		System.out.println("MyAbstractClass.year after init: " + MyAbstractClass.year);
		System.out.println("myAb.month after init: " + myAb.month);

	}

}
