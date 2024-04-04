package my.test.pack.javaConcepts;

public class JavaReplaceString {

	public static void mainJavaReplaceString() {
		// TODO Auto-generated method stub

		System.out.println("Ham5id123".replaceAll("\\d", ""));

		String str = "aaa";

		switch (str.toLowerCase()) {

		case "name":
			System.out.println(str + " name");
			break;
		case "email":
			System.out.println(str + " email");
			break;
		default:
			System.out.println("default");

		}

	}

	public static void StringAlternates() {

		String str = "Name";
		System.out.println("Name. " + str.hashCode());

		str = "Namee";
		System.out.println("Namee. " + str.hashCode());

		str = "Name";
		System.out.println("Name. " + str.hashCode());

		str = new String("Name");
		System.out.println("Name new String. " + str.hashCode());

		String name = "Nick ";

		System.out.println("Name: " + name);

		name.concat("Haul");

		System.out.println("Name: " + name);

		System.out.println("Full Name: " + name.concat("Haul"));

		name = name.concat("Haul");

		System.out.println("Name: " + name);

		System.out.println("\n\n\n\n");

		StringBuilder sb = new StringBuilder("India");

		StringBuilder sb1 = new StringBuilder("India");

		System.out.println(sb + ", " + sb.hashCode());

		System.out.println(sb1 + ", " + sb1.hashCode());

		sb.append(" is ");

		System.out.println(sb + ", " + sb.hashCode());

		StringBuffer sf = new StringBuffer("India");

		StringBuffer sf1 = new StringBuffer("India");

		System.out.println(sf + ", " + sf.hashCode());

		System.out.println(sf1 + ", " + sf1.hashCode());

		sf.append(" is ");

		System.out.println(sf + ", " + sf.hashCode());

		String str3 = "One";

		System.out.println("str3.hashCode(): " + str3.hashCode());

		str3 = str3 + " two";

		System.out.println("str3.hashCode(): " + str3.hashCode());

	}

}
