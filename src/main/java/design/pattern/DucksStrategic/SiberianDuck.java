package design.pattern.DucksStrategic;

public class SiberianDuck extends Duck {

	public SiberianDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am Siberian Duck!!");
	}

}
