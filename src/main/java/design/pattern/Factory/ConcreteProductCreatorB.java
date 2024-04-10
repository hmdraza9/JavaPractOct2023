package design.pattern.Factory;

public class ConcreteProductCreatorB extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
