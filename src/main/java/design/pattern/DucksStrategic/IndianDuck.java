package design.pattern.DucksStrategic;

public class IndianDuck extends Duck {

	public IndianDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am indian duck!!");
	}

}
