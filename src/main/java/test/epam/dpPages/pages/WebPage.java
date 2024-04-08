package test.epam.dpPages.pages;

import test.epam.dpPages.Page;

public class WebPage implements Page {

	private int myRank=15;
	
	@Override
	public int getRank() {
		System.out.println("Creating Web Page - "+myRank);
		return myRank; // Web page has rank = 15
	}

}
