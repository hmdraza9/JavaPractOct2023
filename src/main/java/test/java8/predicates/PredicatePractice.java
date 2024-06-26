package test.java8.predicates;

import java.util.function.Predicate;

public class PredicatePractice {

	public static void mainPredicatePractice() {

		String str = "abcdef";
		String testStr = "abc";

		Predicate<String> stringContains = i -> (str.contains(i));

		System.out.println(stringContains.test(testStr));

		Predicate<Integer> greaterThanTen = i -> (i > 10);

		Predicate<Integer> lessThanTwenty = i -> (i < 20);

		Predicate<Long> hhh = new Predicate<Long>() {

			@Override
			public boolean test(Long t) {

				return false;
			}
		};

		System.out.println("GreaterMLessThan: " + greaterThanTen.and(lessThanTwenty).test(19));

		System.out.println("GreaterNLessThan,negate: " + greaterThanTen.and(lessThanTwenty).negate().test(19));

		System.out.println("hhh: " + hhh.test(null));

	}

}
