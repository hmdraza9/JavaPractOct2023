package test.epam.dpsandwich;

public class SandwichDecorator implements Sandwich {

	Sandwich customSandwich;

	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make();
	}

}
