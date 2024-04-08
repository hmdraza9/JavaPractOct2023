package test.epam.dpsandwich;

public class ChickenDecorator extends SandwichDecorator {

	private Sandwich customSandwich;

	ChickenDecorator(Sandwich customeSandwich) {
		super(customeSandwich);
		this.customSandwich = customeSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}

	public String addDressing() {
		return " and roasted chicken";
	}

}
