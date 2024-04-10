package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

public class ContactWidget extends PageSimulator {

	private Page customPage;
	private int myRank=6;

	public ContactWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Contact widget Added - "+myRank);
		return myRank;
	}

}
