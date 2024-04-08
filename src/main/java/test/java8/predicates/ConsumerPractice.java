package test.java8.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerPractice {

	public static void mainConsumerPractice() {

		Consumer<Integer> cons1 = a -> System.out.print(a + "\t");

		cons1.andThen(cons1).andThen(cons1).accept(11);
		System.out.println("");

		Consumer<Integer> print1to10Evens = ab -> {
			for (int i = 0; i < ab; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		};

		print1to10Evens.accept(16);

		System.out.println("********Modify JAVA Consumer********");

		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};

		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + "\t"));

		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		modify.andThen(dispList).accept(list);
		System.out.println("");

		BiConsumer<Integer, String> combString = (age, name) -> System.out.println("Name: " + name + ", age: " + age);

		combString.accept(12, "New Kid");

		Consumer<String> salute = new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println("Hi " + name);
			}
		};

		salute.accept("John");

	}

}
