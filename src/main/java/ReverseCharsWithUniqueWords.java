import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseCharsWithUniqueWords {

	int a;

	public static void main(String[] args) {
		ReverseCharsWithUniqueWords.testMe();

	}

	public static void testMe() {

		String str = "This the weekend is the";
		// o/p: sihT eht si dnekeew

		// revere chars of each word, remove dups

		System.out.println("Original string is: " + str);

		String[] words = str.split(" ");

		Set<String> wordsSet = new LinkedHashSet<>();

		for (String str1 : words) {

			wordsSet.add(ReverseCharsWithUniqueWords.reverseWordChars(str1));

		}

		String[] destArray = new String[wordsSet.size()];
		int pos = 0;

		for (String mm : wordsSet) {

//			System.out.print(mm + " ");
			destArray[pos] = mm;
			pos++;
		}
//		System.out.println("");
//		System.out.println("Array size: " + pos);

		System.out.print("Modified string is: ");

		for (String str22 : destArray) {

			System.out.print(str22 + " ");

		}
		System.out.println("");
	}

	public static String reverseWordChars(String str) {
		String newWord = "";
		for (int m = 0; m < str.length(); m++) {
			newWord = str.charAt(m) + newWord;
		}
		return newWord;
	}

}
