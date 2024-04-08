package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

public class CalendarWidget extends PageSimulator {

	private Page customPage;
	private int myRank=7;

	public CalendarWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Adding Calendar widget - "+myRank);
		return myRank;
	}

}
