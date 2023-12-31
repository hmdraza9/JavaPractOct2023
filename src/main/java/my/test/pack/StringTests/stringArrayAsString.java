package my.test.pack.StringTests;

import static java.lang.System.out;

public class stringArrayAsString {

	public static void mainstringArrayAsString() {

		char arr[] = { 'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 'g', 'h', ';', 'i', 'j', ' ', 'k', 'l' };
		String str = new String(arr);
		System.out.println(str);
		System.out.println(str.length());

		Double objj = new Double("2.4");
		int a = objj.intValue();
		byte b = objj.byteValue();
		float c = objj.floatValue();
		double d = objj.doubleValue();
		System.out.println("objj: " + objj);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a + b);
		System.out.println(a + b + c);
		System.out.println(a + b + c + d);
		out.println("ee");

	}

	public void demo(String str) {
		String[] arr = str.split(";");
		for (String s : arr) {
			System.out.println(s);
		}
	}

}

abstract class absClass {

	abstract void gett();
}