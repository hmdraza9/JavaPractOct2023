package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

public class FacebookWidget extends PageSimulator {

	private Page customPage;
	private int myRank=9;

	public FacebookWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Adding Facebook widget - "+myRank);
		return myRank;
	}

}
