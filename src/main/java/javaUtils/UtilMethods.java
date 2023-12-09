package javaUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class UtilMethods {

	public Set<Integer> randBetween(int min, int max, int size) {

		int i = 0;

		Set<Integer> randSet = new HashSet<Integer>();

		while (randSet.size() < size) {

			i = (int) (Math.random() * 1000 / 1);
			if (i >= min && i <= max) {
				randSet.add(i);
//				System.out.println(i);
			}
//			System.out.println("randSet.size(): " + randSet.size());
		}
		return randSet;

	}

	public static String getTime() {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss-SSS");
		return sdf.format(cal.getTime());
	}
}
