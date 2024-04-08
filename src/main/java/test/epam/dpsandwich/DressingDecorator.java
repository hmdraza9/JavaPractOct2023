package test.epam.dpsandwich;

public class DressingDecorator extends SandwichDecorator {

	private Sandwich customSandwich;

	DressingDecorator(Sandwich customeSandwich) {
		super(customeSandwich);
		this.customSandwich = customeSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}

	public String addDressing() {
		return " and mustard sauce";
	}

}
