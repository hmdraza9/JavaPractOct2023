package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

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
