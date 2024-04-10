package design.pattern.Pages.pages;

import design.pattern.Page.Page;

public class TouchPage implements Page {

	private int myRank = 8;

	@Override
	public int getRank() {
		System.out.println("Creating Touch Page - " + myRank);
		return myRank; // Touch page has rank= = 8
	}

}
