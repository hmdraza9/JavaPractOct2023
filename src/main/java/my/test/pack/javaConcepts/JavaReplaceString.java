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

}
