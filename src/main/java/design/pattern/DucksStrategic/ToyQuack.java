package design.pattern.DucksStrategic;

public class ToyQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Toy Quack");
	}

}
