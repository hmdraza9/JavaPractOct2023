package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

public class EventWidget extends PageSimulator {

	private Page customPage;
	private int myRank = 8;

	public EventWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Adding Event widget - " + myRank);
		return myRank;
	}

}
