package design.pattern.ElectricityBilling.Factory;

public class DomesticPlan extends Plan {

	public DomesticPlan() {
		rate = 4;
	}

	@Override
	public void getRate() {
//		rate = 3.50;
	}

}
