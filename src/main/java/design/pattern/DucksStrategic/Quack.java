package design.pattern.DucksStrategic;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {

		System.out.println("Real quack");

	}

}
