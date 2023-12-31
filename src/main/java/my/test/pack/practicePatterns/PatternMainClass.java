package my.test.pack.practicePatterns;

public class PatternMainClass {

	public static void mainPatternMainClass() {
		// URL practice -
		// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

		PatternMainClass.print3loops(6);
//		PatternMainClass.pyramidTopViewPatternPract(22);		//22 pract
//		PatternMainClass.pyramidTopViewPattern(5); 				//22
//		PatternMainClass.boxPattern(9, 33); 					//21
//		PatternMainClass.diamondBoxPattern(9, 19); 				//19
//		PatternMainClass.descAlphabetsPattern(5); 				//18
//		PatternMainClass.ascDecimalPattern(9); 					//13
//		PatternMainClass.ascBinaryPattern(9); 					//11
//		PatternMainClass.pyramidLeftPattern(9); 				//10
//		PatternMainClass.diamondPattern(10, 19); 				//9
//		PatternMainClass.pyramidUpsidePattern(10, 19); 			//8
//		PatternMainClass.pyramidPattern(11, 19); 				//7
//		PatternMainClass.descAscCountPattern(5, 5); 			//6
//		PatternMainClass.descPattern(5, 5); 					//5
//		PatternMainClass.ascCountResetHeightPattern(5, 5); 		//4
//		PatternMainClass.ascAscCountResetWidthPattern(5, 5); 	//3
//		PatternMainClass.ascPattern(5, 5);   					//2
//		PatternMainClass.blockPattern(5, 5); 					//1
//		PatternMainClass.blockTestPattern();

	}

	public static void print3loops(int height) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= height; j++) {

				for (int k = 1; k <= height; k++) {

					for (int l = 1; l <= height; l++) {

						System.out.print(i + "" + j + "" + k + "" + l + " ");
					}
					System.out.print("      ");

				}
				System.out.println(" ");

			}
			System.out.println("\n\n");

		}
		System.out.println("");

	}

	public static void pyramidTopViewPatternPract(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int left = j;
				int bottom = (2 * n - 2) - i;
				int right = (2 * n - 2) - j;

				int min = n - (Math.min(Math.min(right, bottom), Math.min(left, top)));

				System.out.print(min + ",");
			}
			System.out.println("");
		}

	}

	public static void pyramidTopViewPattern(int height) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height; j++) {
				if (i == 1 || j == 1 || i == height || j == height) {
					System.out.print(i);
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

	public static void boxPattern(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || j == 1 || i == height || j == width) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

	public static void diamondBoxPattern(int height, int width) {

		int mid = (width / 2) + 1;
//		System.out.println(mid);

		if (width % 2 == 1) {
			System.out.println("Building Upside Pyramid:\n");

			// part 2

			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) < (mid + (2 * i))) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				System.out.println("");
			}

			// part 1
			for (int i = height; i >= 1; i--) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) < (mid + (2 * i))) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				System.out.println("");
			}

			System.out.println("\n\n");
		} else {
			System.out.println("Pyramid not possible!");
		}

	}

	public static void descAlphabetsPattern(int height) {

		String allChars = "abcdefghijklmnopqrstuvqxyz";

		for (int i = height; i >= 1; i--) {
			for (int j = i; j <= height; j++) {
				System.out.print(Character.toUpperCase(allChars.charAt(j - 1)));
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void ascDecimalPattern(int height) {
//		int count = 1;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print(count++);
				System.out.print(i + j);
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void ascBinaryPattern(int height) {
//		boolean isZeroLast = true;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i + j + 1) % 2 == 1) {
					System.out.print("1");
//					isZeroLast = false;
				} else {
					System.out.print("0");
//					isZeroLast = true;
				}
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.print(".");

	}

	public static void pyramidLeftPattern(int width) {
		for (int i = 0; i <= width * 2; i++) {
			for (int j = 0; j <= i; j++) {

//				if ((i + j) >= (mid + 1) && (i + j) <= (mid + (2 * j - 1))) {
				if (((i + j) <= 2 * width) && (i + j) <= 2 * i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}

			}
//			System.out.print("Sum: "+sum);
			System.out.println("");
		}
	}

	public static void diamondPattern(int height, int width) {

		int mid = (width / 2) + 1;
//		System.out.println(mid);

		if (width % 2 == 1) {
			System.out.println("Building Upside Pyramid:\n");

			// part 2

			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) < (mid + (2 * i))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");
			}

			// part 1
			for (int i = height; i >= 1; i--) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) < (mid + (2 * i))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");
			}

			System.out.println("\n\n");
		} else {
			System.out.println("Pyramid not possible!");
		}

	}

	public static void pyramidUpsidePattern(int height, int width) {

		int mid = (width / 2) + 1;
//		System.out.println(mid);

		if (width % 2 == 1) {
			System.out.println("Building Upside Pyramid:\n");

			for (int i = height; i >= 1; i--) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) <= (mid + (2 * i - 1))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");
			}
			System.out.println("\n\n");
		} else {
			System.out.println("Pyramid not possible!");
		}

	}

	public static void pyramidPattern(int height, int width) {

		int mid = (width / 2) + 1;
//		System.out.println(mid);

		if (width % 2 == 1) {
			System.out.println("Building Pyramid:\n");

			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= width; j++) {

					if ((i + j) >= (mid + 1) && (i + j) <= (mid + (2 * i - 1))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println("");
			}
			System.out.println("\n\n");
		} else {
			System.out.println("Pyramid not possible!");
		}

	}

	public static void descAscCountPattern(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void descPattern(int height, int width) {

		for (int i = height; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void ascCountResetHeightPattern(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void ascAscCountResetWidthPattern(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void ascPattern(int height, int width) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n\n");

	}

	public static void blockPattern(int height, int width) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void blockTestPattern() {

		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < width; j++) {
			System.out.print("*");
//			}
//			System.out.println("");
		}

	}

}
