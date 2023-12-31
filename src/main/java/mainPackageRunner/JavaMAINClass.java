package mainPackageRunner;

import java.io.IOException;

import my.test.pack.ExtendsPract;
import my.test.pack.ReverseCharsWithUniqueWords;
import my.test.pack.TestingMethods;
import my.test.pack.Exceptions.ExceptionsPract;

public class JavaMAINClass {

	public static void main(String[] args) throws IOException {

		ExceptionsPract.mainExceptionPract();
		TestingMethods.mainTestingMethods();
		ReverseCharsWithUniqueWords.mainReverseCharsWithUniqueWords();
		ExtendsPract.mainExtendsPract();

		
	}

}
