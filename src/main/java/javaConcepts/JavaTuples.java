package javaConcepts;

import org.javatuples.Decade;
import org.javatuples.Ennead;
import org.javatuples.Octet;
import org.javatuples.Pair;
import org.javatuples.Quartet;
import org.javatuples.Quintet;
import org.javatuples.Septet;
import org.javatuples.Sextet;
import org.javatuples.Triplet;
import org.javatuples.Unit;

public class JavaTuples {
	public static void main(String[] args) { // TODO Auto-generated method stub
//Java Tuples jar dependency URL: https://repo1.maven.org/maven2/org/javatuples/javatuples/1.2/javatuples-1.2.jar
		org.javatuples.Unit<String> unit = new Unit<String>("I am unit in Java  Tuples");
		System.out.println("org.javatuples.Unit: " + unit);
		Pair<Integer, String> pair = new Pair<Integer, String>((Integer.valueOf(1) + Integer.valueOf(56)),
				"GeeksforGeeks");
		System.out.println("org.javatuples.Pair: " + pair);
		Triplet<String, Integer, Float> triplet = new Triplet<String, Integer, Float>("Hi", 23, 3F);
		System.out.println("org.javatuples.Triplet: " + triplet);
		org.javatuples.Quartet<String, String, String, String> quartet = new Quartet<String, String, String, String>(
				"This", "is", "Example of", "Quartet");
		System.out.println("org.javatuples.Quartet: " + quartet);
		org.javatuples.Quintet<String, String, String, String, String> quintet = new Quintet<String, String, String, String, String>(
				"This", "is", "Example", "of", "Quintet");
		System.out.println("org.javatuples.Quintet: " + quintet);
		org.javatuples.Sextet<String, String, String, String, String, String> sextet = new Sextet<String, String, String, String, String, String>(
				"And", "This", "is", "Example", "of", "Sextet");
		System.out.println("org.javatuples.Sextet: " + sextet);
		org.javatuples.Septet<String, String, String, String, String, String, String> septet = new Septet<String, String, String, String, String, String, String>(
				"But", "Now", "This", "is", "the", "Example", "Septet");
		System.out.println("org.javatuples.Septet: " + septet);
		org.javatuples.Octet<String, String, String, String, String, String, String, String> octet = new Octet<String, String, String, String, String, String, String, String>(
				"Yet", "But", "Now", "This", "is", "the", "Example", "Octet");
		System.out.println("org.javatuples.Octet: " + octet);
		org.javatuples.Ennead<String, String, String, String, String, String, String, String, String> ennead = new Ennead<String, String, String, String, String, String, String, String, String>(
				"Again", "Yet", "But", "Now", "This", "is", "the", "Example", "Ennead");
		System.out.println("org.javatuples.Ennead:" + ennead);
		org.javatuples.Decade<String, String, String, String, String, String, String, String, String, String> decade = new Decade<String, String, String, String, String, String, String, String, String, String>(
				"Finally", "Again", "Yet", "But", "Now", "This", "is", "the", "Example", "Decade");
		System.out.println("org.javatuples.Decade: " + decade);

		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		if (s1 == s2) {
			System.out.println("s1 and s2 equal");
		} else {
			System.out.println("s1 and s2 not equal");
		}
		if (s1 == s3) {
			System.out.println("s1 and s3 equal");
		} else {
			System.out.println("s1 and s3 not equal");
		}

		String s = new String("5");
		System.out.println(1 + 10 + s + 1 + 10);
		
		
		String mySent = "I am a boy";
		String word = "";
		String reverse = "";
		
		for(String str : mySent.split("")) {
			
//			System.out.println("Str: >"+str+"< if space?: "+str.equals(" "));
			
			if(str.equals(" ")) {
//				System.out.print(str+"");
				reverse = word +" " + reverse;
				word = "";
				System.out.println("if   Reverse: "+reverse+"; Word: "+word);
			}
			else {
//				System.out.print(str+"");
				word = word + str;
				System.out.println("else Reverse: "+reverse+"; Word: "+word);
			}
			
			
		}
		reverse = word +" " + reverse;
		System.out.println("\nreverse: "+reverse);
		

	}
}