package design.pattern.LunchMenu;

public class LunchServe {

	public static void main(String[] args) {

		System.out.println("Dessert: " + new LunchServe().getLunchMenu(args).getDessert());
		System.out.println("Starter: " + new LunchServe().getLunchMenu(args).getStarter());
		System.out.println("Main Course: " + new LunchServe().getLunchMenu(args).getMainCourse());

	}

	public LunchMenu getLunchMenu(String[] args) {
		LunchMenu.Builder builder = new LunchMenu.Builder("Biryani").starter("Kabab").starter("Veg Roll").starter("Corn Fry").dessert("iceCream");

		return builder.build();

	}

}
