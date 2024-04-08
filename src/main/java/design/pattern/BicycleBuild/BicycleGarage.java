package design.pattern.BicycleBuild;

import java.util.ArrayList;
import java.util.List;

public class BicycleGarage {

	private List<String> accessories;
	private String baseFrame;
	private List<String> fittings;

	private BicycleGarage(Builder builder) {
		this.accessories = builder.accessories;
		this.baseFrame = builder.baseFrame;
		this.fittings = builder.fittings;
	}

	public List<String> getAccessories() {
		return accessories;
	}

	public String getBaseFrame() {
		return baseFrame;
	}

	public List<String> getFittings() {
		return fittings;
	}

	public static class Builder {

		public Builder(String baseFrame) {
			this.baseFrame = baseFrame;
		}

		private List<String> accessories = new ArrayList<String>();
		private String baseFrame;
		private List<String> fittings = new ArrayList<String>();

		public Builder accessories(String accessories) {
			this.accessories.add(accessories);
			return this;
		}

		public Builder baseFrame(String baseFrame) {
			this.baseFrame = baseFrame;
			return this;
		}

		public Builder fittings(String fittings) {
			this.fittings.add(fittings);
			return this;
		}

		public BicycleGarage build() {
			return new BicycleGarage(this);
		}

	}

}
