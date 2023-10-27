package javaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionHashMap obj = new CollectionHashMap();
//		obj.playWithHashMap();
//		obj.convertSeries();
		int num1 = 12, num2 = 288;
		System.out.println(obj.lcmFind(num1, num2));

		System.out.println("HCF long cut: " + CollectionHashMap.hcfFind(num1, num2));
		System.out.println("LCM short cut: " + (num1 / hcfFind(num1, num2)) * num2);
		System.out.println("HCF short cut: " + (num1 * num2) / obj.lcmFind(num1, num2));

		System.out.println("Check if vowel - a : " + checkVowel('a'));
		System.out.println("Check if vowel - i : " + checkVowel('i'));
		System.out.println("Check if vowel - s : " + checkVowel('s'));
		System.out.println("Check if vowel - P : " + checkVowel('P'));
		System.out.println("Check if vowel - O : " + checkVowel('O'));
		System.out.println("Check if vowel - U : " + checkVowel('U'));

	}

	public static boolean checkVowel(Character ch) {

		System.out.print("aeiouAEIOU".indexOf(ch) + " ");

		ch = Character.toLowerCase(ch);

		return ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'));

	}

	public static int hcfFind(int num1, int num2) {
		if (num1 == 0)
			return num2;
		return hcfFind(num2 % num1, num1);

	}

	public int lcmFind(int num1, int num2) {

		int bigNum = (num1 > num2) ? num1 : num2;

		while (true) {

			if ((bigNum % num1 == 0) && bigNum % num2 == 0)
				break;
			bigNum++;

		}
		System.out.println("LCM long cut: " + bigNum);
		return bigNum;

	}

	public void convertSeries() {

		char[] chars = new char[] { '\u0032' };
		System.out.println(chars);
		String str = new String(chars);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(chars));

	}

	public void playWithHashMap() {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aa", "AA");
		hm.put("bb", "BB");
		hm.put("cc", "CC");
		hm.put("dd", "DD");
		hm.put("dd", "DDD");

		for (String str : hm.keySet()) {
			System.out.println(hm.get(str));
		}
	}

}
