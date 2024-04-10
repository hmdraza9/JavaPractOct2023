package test.epam.dpPages;

public class PageSimulator implements Page {

	Page customPage;

	public PageSimulator(Page customPage) {
		this.customPage = customPage;
		System.out.println("PageSimulator constructor called");
	}

	@Override
	public int getRank() {
		return customPage.getRank();
	}

}
