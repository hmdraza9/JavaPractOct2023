package design.pattern.ElectricityBilling.Factory;

public class DemoElectricityBill {

	// https://www.javatpoint.com/factory-method-design-pattern

	public static void main(String[] args) {
		GetPlanFactory getPlan = new GetPlanFactory();
		Plan dom = getPlan.getPlan("DOMestic");
		Plan inst = getPlan.getPlan("Institution");
		Plan comm = getPlan.getPlan("COMMERCIAL");
		dom.getRate();
		dom.calculateBill(123);
		inst.getRate();
		inst.calculateBill(123);
		comm.getRate();
		comm.calculateBill(123);
	}
}
