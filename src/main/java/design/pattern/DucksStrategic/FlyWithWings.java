package design.pattern.DucksStrategic;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}
