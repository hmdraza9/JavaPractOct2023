package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

public class GoogleMapsWidget extends PageSimulator {

	private Page customPage;
	private int myRank = 5;

	public GoogleMapsWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Google map widget Added - " + myRank);
		return myRank;
	}

}
