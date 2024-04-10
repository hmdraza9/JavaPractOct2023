package design.pattern.Page;

import design.pattern.Pages.pages.TouchPage;
import design.pattern.Pages.pages.WebPage;
import design.pattern.Pages.widgets.ContactWidget;
import design.pattern.Pages.widgets.EventWidget;
import design.pattern.Pages.widgets.FacebookWidget;
import design.pattern.Pages.widgets.GoogleMapsWidget;
import design.pattern.Pages.widgets.OpenAIWidget;
import design.pattern.Pages.widgets.TwitterWidget;

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
