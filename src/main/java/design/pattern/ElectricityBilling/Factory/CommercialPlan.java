package design.pattern.ElectricityBilling.Factory;

public class CommercialPlan extends Plan {

	@Override
	public void getRate() {
		rate = 7.50;
	}

}
