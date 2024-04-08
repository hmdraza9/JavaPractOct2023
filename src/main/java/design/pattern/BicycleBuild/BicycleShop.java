package design.pattern.BicycleBuild;

public class BicycleShop {

	public static void main(String[] args) {

		System.out.println("Fittings: " + new BicycleShop().getBicycleFitter(args).getFittings());
		System.out.println("Accessories: " + new BicycleShop().getBicycleFitter(args).getAccessories());
		System.out.println("Base Frame: " + new BicycleShop().getBicycleFitter(args).getBaseFrame());

	}

	public BicycleGarage getBicycleFitter(String[] args) {
		BicycleGarage.Builder builder = new BicycleGarage.Builder("Basic Cycle").accessories("helmet")
				.accessories("toolkit").accessories("lights").accessories("lights").accessories("lights").accessories("lights").accessories("carrier").fittings("gears").fittings("gears").fittings("gears")
				.fittings("disc brake");

		return builder.build();

	}

}
