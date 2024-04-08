package design.pattern.DucksStrategic;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {

		System.out.println("Can't fly");
	}

}
