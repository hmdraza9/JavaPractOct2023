package omniTopic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedException {
	public static CheckedException ch = new CheckedException();
	String filePath = "src/test/resources/TestFile.txt";
	
	public String courseBody = "{\r\n" + "  \"dashboard\": {\r\n" + "    \"purchaseAmount\": 1162,\r\n"
			+ "    \"website\": \"rahulshettyacademy.com\"\r\n" + "  },\r\n" + "  \"courses\": [\r\n" + "    {\r\n"
			+ "      \"title\": \"Selenium Python\",\r\n" + "      \"price\": 50,\r\n" + "      \"copies\": 6\r\n"
			+ "    },\r\n" + "    {\r\n" + "      \"title\": \"Cypress\",\r\n" + "      \"price\": 40,\r\n"
			+ "      \"copies\": 4\r\n" + "    },\r\n" + "    {\r\n" + "      \"title\": \"RPA\",\r\n"
			+ "      \"price\": 45,\r\n" + "      \"copies\": 10\r\n" + "    },\r\n" + "     {\r\n"
			+ "      \"title\": \"Appium\",\r\n" + "      \"price\": 36,\r\n" + "      \"copies\": 7\r\n" + "    }\r\n"
			+ "    \r\n" + "    \r\n" + "    \r\n" + "  ]\r\n" + "}\r\n" + "";

	public static void main(String[] args) throws IOException {
//		ch.randomMethod();
//		ch.fileAsByteToString();
		
		String str = "hello a";
		String str1 = "hello a";
		String str2 = new String("hello a");

		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";
        if (s1 == s2) {
            System.out.println("s1 and s2 equal");
        } else {
            System.out.println("s1 and s2 not equal");
        }
        if (s1 == s3) {
            System.out.println("s1 and s3 equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }

	}

	public void randomMethod() {

		int a = 12;
		if (a < 10)

		{

			System.out.println(a + 10);
//sysout(a+10)

		}

		else if (a == 10)

		{

			System.out.println(a++);
//print(a++)

		}

		else if (a > 10)

		{

//print(--a+ ++a)
			System.out.println(--a + ++a);
			System.out.println(a);

		}

		System.out.println("\n\n\n\n");
		int aa = 20, bb = 23;
		ch.swapNums(aa, bb);

		System.out.print("aa::bb -->" + aa + " " + bb);

		aa = aa + bb;
		bb = aa - bb;
		aa = aa - bb;

		System.out.println("--> aa::bb -->" + aa + " " + bb);
	}

	public void swapNums(int aa, int bb) {

		System.out.print("In method\naa::bb -->" + aa + " " + bb);

		aa = aa + bb;
		bb = aa - bb;
		aa = aa - bb;

		System.out.println("--> aa::bb -->" + aa + " " + bb);

	}

	public void fileAsByteToString() throws IOException {

		File file = new File(filePath);
		System.out.println(file.exists());
		byte[] fileByte = Files.readAllBytes(Paths.get(filePath));

		System.out.println(fileByte);
		System.out.println(courseBody);

	}

}
