package design.pattern.productCreator.Factory;

public class ConcreteProductCreatorA extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
