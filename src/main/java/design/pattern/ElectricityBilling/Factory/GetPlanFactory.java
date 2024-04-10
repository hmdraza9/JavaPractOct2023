package design.pattern.ElectricityBilling.Factory;

class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		} else {

			if (planType.equalsIgnoreCase("DOMESTIC")) {
				return new DomesticPlan();
			}

			if (planType.equalsIgnoreCase("INSTITUTION")) {
				return new InstitutionPlan();
			}

			if (planType.equalsIgnoreCase("COMMERCIAL")) {
				return new CommercialPlan();
			}
		}

		return null;
	}

}
