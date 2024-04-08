package design.pattern.DucksStrategic;

public class ToyDuck extends Duck {

	public ToyDuck() {
		quackBehaviour = new ToyQuack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am Toy Duck!!");
	}

}
