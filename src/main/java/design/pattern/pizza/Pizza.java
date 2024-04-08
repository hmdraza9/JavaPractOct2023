package design.pattern.pizza;

public class Pizza {

	private int baseStandard = 2;
	private int baseSoft = 5;

	private Toppings topping;

	public Pizza(int topTomato, int topCorn, int topMushrooms) {


		this.topping = new Toppings();

		topping.setTopTomato(topTomato);
		topping.setTopCorn(topCorn);
		topping.setTopMushrooms(topMushrooms);

	}

	public int getBase(String base) {
		System.out.println("Base: " + base);
		if (base.equalsIgnoreCase("standard"))
			return baseStandard;
		else
			return baseSoft;
	}

	public int getTopTomato() {
		return topping.getTopTomato();
	}

	public int getTopCorn() {
		return topping.getTopCorn();
	}

	public int getTopMushrooms() {
		return topping.getTopMushrooms();
	}

	public static void main(String[] args) {

		Pizza pizza = new Pizza(2, 3, 4);
		System.out.println("Prize of pizza: "
				+ (pizza.getBase("Soft") + pizza.getTopMushrooms() + pizza.getTopCorn() + pizza.getTopTomato()));

	}

}
