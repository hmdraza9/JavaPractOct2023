package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

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
		System.out.println("Adding Contact widget - "+myRank);
		return myRank;
	}

}
