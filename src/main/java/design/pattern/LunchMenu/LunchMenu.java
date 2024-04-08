package design.pattern.LunchMenu;

import java.util.ArrayList;
import java.util.List;

public class LunchMenu {

	private List<String> starter;
	private String mainCourse;
	private String dessert;

	private LunchMenu(Builder builder) {
		this.starter = builder.starter;
		this.mainCourse = builder.mainCourse;
		this.dessert = builder.dessert;
	}

	public List<String> getStarter() {
		return starter;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public String getDessert() {
		return dessert;
	}

	public static class Builder {

		public Builder(String mainCourse) {
			this.mainCourse = mainCourse;
		}

		private List<String> starter = new ArrayList<String>();
		private String mainCourse;
		private String dessert;

		public Builder starter(String starter) {
			this.starter.add(starter);
			return this;
		}

		public Builder mainCourse(String mainCourse) {
			this.mainCourse = mainCourse;
			return this;
		}

		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public LunchMenu build() {
			return new LunchMenu(this);
		}

	}

}
