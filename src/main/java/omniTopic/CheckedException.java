package omniTopic;

public class CheckedException {

	public static void main(String[] args) {

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
		CheckedException.swapNums(aa, bb);

		System.out.print("aa::bb -->" + aa + " " + bb);

		aa = aa + bb;
		bb = aa - bb;
		aa = aa - bb;

		System.out.println("--> aa::bb -->" + aa + " " + bb);

	}

	public static void swapNums(int aa, int bb) {

		System.out.print("In method\naa::bb -->" + aa + " " + bb);

		aa = aa + bb;
		bb = aa - bb;
		aa = aa - bb;

		System.out.println("--> aa::bb -->" + aa + " " + bb);

	}

	public static void unitTestSwapNums() {

		
		
	}

}
