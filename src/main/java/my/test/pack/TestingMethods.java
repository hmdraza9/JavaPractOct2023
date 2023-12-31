package my.test.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestingMethods {
	private static final Logger log = LogManager.getLogger(TestingMethods.class);

	public static void mainTestingMethods() throws IOException {
//		System.out.println(122);
//		my.test.pack.Derived b = new my.test.pack.DeriDerived();

		String s1 = "Hello";
		String s2 = new String("Hello");
		s2 = s2.intern();
		System.out.println(s1 == s2);
		log.info("s1 == s2: " + s1 == s2);
		TestingMethods.readProps();

	}

//	public void print(Integer i) {
//		System.out.println("Integer");
//	}
//
//	public void print(int i) {
//		System.out.println("int");
//	}
//
//	public void print(long i) {
//		System.out.println("long");
//	}

	public static void readProps() throws IOException {

		String propsPath = "src/test/resources/config.properties";

		FileInputStream fis = new FileInputStream(new File(propsPath));
		Properties props = new Properties();
		props.load(fis);
		String returnString = props.getProperty("URL.moneycontrol");
		System.out.println(returnString);
		fis.close();

	}

}

class Base {
	public Base() {
		System.out.println("my.test.pack.Base");
	}

	private void BaseMeth() {
		System.out.println("BaseMeth");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("my.test.pack.Derived");
	}

//	public void BaseMeth() {

//	private void BaseMeth() {

	public void BaseMeth() {
		System.out.println("hi");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {
		System.out.println("my.test.pack.DeriDerived");
	}
}
