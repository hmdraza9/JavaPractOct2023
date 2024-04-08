package test.epam.dpPages;

import test.epam.dpPages.pages.WebPage;
import test.epam.dpPages.widgets.ContactWidget;
import test.epam.dpPages.widgets.EventWidget;
import test.epam.dpPages.widgets.FacebookWidget;
import test.epam.dpPages.widgets.GoogleMapsWidget;
import test.epam.dpPages.widgets.TwitterWidget;

public class DemoPage {

	public static void main(String[] args) {

		Page page = new TwitterWidget(
				new EventWidget(new GoogleMapsWidget(new FacebookWidget(new ContactWidget(new WebPage())))));
		System.out.println("Page's total rank: " + page.getRank());

	}

}
