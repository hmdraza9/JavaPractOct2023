package test.epam.dpPages.widgets;

import test.epam.dpPages.Page;
import test.epam.dpPages.PageSimulator;

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
