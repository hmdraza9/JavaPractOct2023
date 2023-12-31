package my.test.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class testExtends extends TestParent {

	public void testParent() {
		System.out.println("test child");
	}

	public void testChildOnlya() {
		System.out.println("test child");
	}

	public static void testStaticMeth() {
		System.out.println("Test Static Meth my.test.pack.testExtends");
	}

	public void testChildOnly() {
		System.out.println("test child only");
	}

}

class testExtends2 extends TestParent {

	public void testParent() {
		System.out.println("test child2");
	}

}

class TestParent {

	public void testParent() {
		System.out.println("test parent");
	}

	public static void testStaticMeth() {
		System.out.println("Test Static Meth Parent");
	}

}

class T {

	int tt = 20;

	T() {
		tt = 40;
	}

}

interface II {

	public static final int iValue = 11;

	public void bingMe();

}

public class ExtendsPract {

	int ii;
	String kk;
	Double dd;
	long ll;
	int[] arr;

	public void variableInitLocalVSClassVar() {

		int jj = 11;

		System.out.println("ii: " + ii);
		System.out.println("kk: " + kk);
		System.out.println("dd: " + dd);
		System.out.println("ll: " + ll);
		System.out.println("jj: " + jj);
		System.out.println("arr: " + arr);

		final int jk;
		jk = 12;
//		jk = 10;

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		System.out.println("arr1==arr2: " + (arr1 == arr2));
		System.out.println("arr1.equals(arr2): " + (arr1.equals(arr2)));
		System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
	}

	public static void mainExtendsPract() {
		TestParent tp = new testExtends();
		testExtends tp2 = new testExtends();
//		tp.testChildOnlya(); // error
		tp.testParent();
		TestParent.testStaticMeth();
		testExtends.testStaticMeth();
		ExtendsPract tp3 = new ExtendsPract();
		System.out.println("tp3.variableInitLocalVSClassVar: ");
		tp3.variableInitLocalVSClassVar();

		System.out.println(1.0 / 0.0);
		System.out.println(Double.isNaN(1.1));

//		((my.test.pack.testExtends2) tp).testParent(); //CAST

		T t1 = new T();
		System.out.println("t1.tt: " + t1.tt);

		ArrayList<String> al = new ArrayList<String>();
		al.add("British");
		al.add("Cinema");
		al.add("Council");
		Iterator<String> it = al.iterator();
		System.out.println("\n\n\nAl: " + al);
		it.next();
		it.remove();
		System.out.println("Al: " + al);
		it.next();
		it.remove();
		System.out.println("Al: " + al);
		it.next();
		it.remove();
		System.out.println("Al: " + al);

//		Enumeration<String> enume = al.en

	}

}