package test.java8.lambda;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.Consumer;

public class JavaRunner {

	public static void main(String[] args) {

		StringFunction exclaim = (s) -> s + "!";

		StringFunction ask = (s) -> s + "?";

		printFormatted("Hello", exclaim);

		printFormatted("Hello", ask);

		Consumer<String> cons1 = (s) -> System.out.println("Hello " + s);
		
		cons1.accept("John");

	}

	public static void printFormatted(String ss, StringFunction format) {

		System.out.println(format.run(ss));

	}

}
