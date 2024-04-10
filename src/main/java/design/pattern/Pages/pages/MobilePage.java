package design.pattern.Pages.pages;

import design.pattern.Page.Page;

public class MobilePage implements Page {

	private int myRank=12;
	
	@Override
	public int getRank() {
		System.out.println("Creating Mobile Page - "+myRank);
		return myRank; // Mobile page has rank= = 12
	}

}
