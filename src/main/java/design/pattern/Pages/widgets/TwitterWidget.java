package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

public class TwitterWidget extends PageSimulator {

	private Page customPage;
	private int myRank = 10;

	public TwitterWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("Twitter widget Added - " + myRank);
		return myRank;
	}

}
