package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

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
		System.out.println("Calendar widget Added - "+myRank);
		return myRank;
	}

}
