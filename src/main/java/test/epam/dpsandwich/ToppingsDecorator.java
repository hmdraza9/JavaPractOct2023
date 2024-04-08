package test.epam.dpsandwich;

public class ToppingsDecorator extends SandwichDecorator {

	private Sandwich customSandwich;

	ToppingsDecorator(Sandwich customeSandwich) {
		super(customeSandwich);
		this.customSandwich = customeSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}

	public String addDressing() {
		return " and capsicum and onion";
	}

}
