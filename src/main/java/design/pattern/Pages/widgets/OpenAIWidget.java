package design.pattern.Pages.widgets;

import design.pattern.Page.Page;
import design.pattern.Page.PageSimulator;

public class OpenAIWidget extends PageSimulator {

	private Page customPage;
	private int myRank = 3;

	public OpenAIWidget(Page customPage) {
		super(customPage);
		this.customPage = customPage;
	}

	@Override
	public int getRank() {
		return (customPage.getRank() + addRank());
	}

	public int addRank() {
		System.out.println("OpenAI widget Added - " + myRank);
		return myRank;
	}

}
