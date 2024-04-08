package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

public class TwitterWidget extends PageSimulator {

	private Page customPage;
	private int myRank=10;

	public TwitterWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Adding Twitter widget - "+myRank);
		return myRank;
	}

}
