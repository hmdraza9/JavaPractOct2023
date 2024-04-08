package test.epam.dpsandwich;

public class DemoSandwich {

	public static Sandwich sandwich;

	public static void main(String[] args) {

		sandwich = new ChickenDecorator(new DressingDecorator(new PlainSandwich()));
		System.out.println("Indian Chicken 				>>" + sandwich.make());
		sandwich = new ChickenDecorator(new DressingDecorator(new MaxicanPlainSandwich()));
		System.out.println("Maxican Chicken				>>" + sandwich.make());
		sandwich = new ToppingsDecorator(new ChickenDecorator(new DressingDecorator(new PlainSandwich())));
		System.out.println("Indian Chicken With topping 		>>" + sandwich.make());

	}

}
