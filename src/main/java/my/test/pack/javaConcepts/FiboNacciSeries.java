package my.test.pack.javaConcepts;

public class FiboNacciSeries {

	public static void mainFiboNacciSeries() {

		int fNum = 0, lNum = 1;
		System.out.println(fNum);
		System.out.println(lNum);
		int oddSum = fNum;
		int evenSum = lNum;

		for (int i = 1; i < 10; i++) {

			int temp = fNum + lNum;
			System.out.println("Digit: " + temp);
			fNum = lNum;
			lNum = temp;

			// to get some of all even steps
			if (i % 2 == 0) {
				evenSum = evenSum + temp;
				System.out.print(i + ". Even turn digit: " + temp);
				System.out.print(" Even sum: " + evenSum);
				System.out.println("");
			} else {

				oddSum = oddSum + temp;
				System.out.print(i + ". Odd turn digit: " + temp);
				System.out.print(" Odd sum: " + evenSum);
				System.out.println("");
			}
		}
	}

}
