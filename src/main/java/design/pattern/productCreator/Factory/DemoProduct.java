package design.pattern.productCreator.Factory;

public class DemoProduct {

	// https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

	public static void main(String[] args) {

		Creator creatorA = new ConcreteProductCreatorA();
		Product productA = creatorA.factoryMethod();
		productA.createProduct();

		Creator creatorB = new ConcreteProductCreatorB();
		Product productB = creatorB.factoryMethod();
		productB.createProduct();

	}

}
