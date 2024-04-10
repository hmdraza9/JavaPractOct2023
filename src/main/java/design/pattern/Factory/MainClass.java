package design.pattern.Factory;

public class MainClass {

	public static void main(String[] args) {

		Creator creatorA = new ConcreteProductCreatorA();
		Product productA = creatorA.factoryMethod();
		productA.createProduct();

		Creator creatorB = new ConcreteProductCreatorB();
		Product productB = creatorB.factoryMethod();
		productB.createProduct();

	}

}
