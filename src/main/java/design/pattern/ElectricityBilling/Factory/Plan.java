package design.pattern.ElectricityBilling.Factory;

abstract class Plan {

	double rate;

	abstract void getRate();
	// We can set the rate either with the help of extra method which need to be
	// called from demo, and also right when
	// we call the class's constructor
	// see class DomesticPlan()

	public void calculateBill(float units) {
		System.out.println("Bill: " + units * rate);
	}

}
