package design.pattern.productCreator.Factory;

public class ConcreteProductA extends Product {

	@Override
	public void createProduct() {
		System.out.println("Concrete Product A");
	}

}