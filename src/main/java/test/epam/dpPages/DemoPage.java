package test.epam.dpPages;

import test.epam.dpPages.pages.TouchPage;
import test.epam.dpPages.pages.WebPage;
import test.epam.dpPages.widgets.ContactWidget;
import test.epam.dpPages.widgets.EventWidget;
import test.epam.dpPages.widgets.FacebookWidget;
import test.epam.dpPages.widgets.GoogleMapsWidget;
import test.epam.dpPages.widgets.OpenAIWidget;
import test.epam.dpPages.widgets.TwitterWidget;

public class DemoPage {

	public static void main(String[] args) {

		Page webpage = new EventWidget(
				new TwitterWidget(new GoogleMapsWidget(new FacebookWidget(new ContactWidget(new WebPage())))));
		System.out.println("Web-Page's total rank: " + webpage.getRank());

		System.out.println("\n\n");

		Page touchpage = new TwitterWidget(
				new EventWidget(new GoogleMapsWidget(new FacebookWidget(new ContactWidget(new TouchPage())))));
		System.out.println("Touch-Page's total rank: " + touchpage.getRank());

		System.out.println("\n\n");

		Page webpageAI = new OpenAIWidget(new TwitterWidget(
				new EventWidget(new GoogleMapsWidget(new FacebookWidget(new ContactWidget(new WebPage()))))));
		System.out.println("Web-Page with AI's total rank: " + webpageAI.getRank());

		System.out.println("\n\n");

		Page basicPage = new WebPage();
		System.out.println("new WebPage's total rank: " + basicPage.getRank());

		System.out.println("\n\n");

		Page basicPage2 = new GoogleMapsWidget(webpage);
		System.out.println("new WebPage's total rank: " + basicPage2.getRank());

	}

}
