package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

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
		System.out.println("Facebook widget Added - "+myRank);
		return myRank;
	}

}
