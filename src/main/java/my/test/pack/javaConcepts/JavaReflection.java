package my.test.pack.javaConcepts;

public class JavaReflection {

	static void pattern22(int n) {

		// Outer loop for no. of rows
		for (int i = 0; i < 2 * n - 1; i++) {

			// inner loop for no. of columns.
			for (int j = 0; j < 2 * n - 1; j++) {

				// Initialising the top, down, left and right indices of a cell.
				int top = i;
				int bottom = j;
				int right = (2 * n - 2) - j;
				int left = (2 * n - 2) - i;

				// Min of 4 directions and then we subtract from n
				// because previously we would get a pattern whose border
				// has 0's, but we want with border N's and then decrease inside.
//				System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
				System.out.print(Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// As soon as the numbers for each iteration are printed, we move to the
			// next row and give a line break otherwise all numbers
			// would get printed in 1 line.
			System.out.println("");
		}
	}

	public static void main(String args[]) {

//		JavaReflection.pattern22(3);
		JavaReflection.testss();

	}

	public static void testss() {

		String[][] namesArr = { { "aa", "bb" }, { "cc", "dd" }, { "ee", "ff" } };

		System.out.print("namesArr.length: " + namesArr.length + "; ");

		for (String[] strArr : namesArr) {
			System.out.print("strArr.length: " + strArr.length + "; ");
			for (String str : strArr) {
				System.out.print(str + " ");
			}
			System.out.println("");
		}

	}
}