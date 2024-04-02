package test.predicates.java8;

import java.util.function.Predicate;

public class PredicatePractice {

	public static void main(String[] args) {

		String str = "abcdef";
		String testStr = "abc";

		Predicate<String> stringContains = i -> (str.contains(i));

		System.out.println(stringContains.test(testStr));

		Predicate<Integer> greaterThanTen = i -> (i > 10);

		Predicate<Integer> lessThanTwenty = i -> (i < 20);

		System.out.println("GreaterMLessThan: " + greaterThanTen.and(lessThanTwenty).test(19));

		System.out.println("GreaterNLessThan,negate: " + greaterThanTen.and(lessThanTwenty).negate().test(19));

	}

}
