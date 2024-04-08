package test.epam.DesPatternTask01;

public class DesPatternTask01Runner {

	public static void main(String[] args) {

		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());
		System.out.println(CandyMaker.getInstance().hashCode());

		// Multi thread

		Multithread.mainMultithreadingDemo(20);

	}

}
