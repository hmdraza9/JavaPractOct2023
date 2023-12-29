package my.test.pack.javaConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrListVSLinkdList {

	public static String sentence = "Java HashMap is not thread-safe and hence it should not be used in multithreaded applications. For the multi-threaded applications, we should use ConcurrentHashMap class";

	public static void main(String[] args) {

		ArrListVSLinkdList obj = new ArrListVSLinkdList();

//		obj.useLinkedList();
		obj.countNumberOfCharsInSentence(sentence);

	}

	public void useLinkedList() {

		LinkedList<String> myLList = new LinkedList<String>();

		StringBuilder newLastText = new StringBuilder("New one");

		myLList.add("One");
		myLList.add("Two");
		myLList.add("Three");
		myLList.add("Four");
		myLList.add("Five");

		System.out.println("First: " + myLList.getFirst());
		System.out.println("Last: " + myLList.getLast() + "\n");

		System.out.println("First: " + myLList.removeFirst());
		System.out.println("Last: " + myLList.removeLast() + "\n");

		System.out.println("First: " + myLList.getFirst());
		System.out.println("Last: " + myLList.getLast() + "\n");

		myLList.add(0, "New One");
		newLastText.append("_new");
		System.out.println(newLastText);
		myLList.add(myLList.size(), newLastText.toString());

		System.out.println("First: " + myLList.getFirst());
		System.out.println("Last: " + myLList.getLast() + "\n");

		myLList.add(0, "New One");
		newLastText.append("_new");
		System.out.println(newLastText);
		myLList.add(myLList.size(), newLastText.toString());

		System.out.println("First: " + myLList.getFirst());
		System.out.println("Last: " + myLList.getLast() + "\n");

		myLList.add(0, "New One");
		newLastText.append("_new");
		System.out.println(newLastText);
		myLList.add(myLList.size(), newLastText.toString());

		System.out.println("First: " + myLList.getFirst());
		System.out.println("Last: " + myLList.getLast() + "\n");

		for (String str : myLList) {
			System.out.println(str);
		}

	}

	public void countNumberOfCharsInSentence(String str) {

		HashMap<String, Integer> charCount = new HashMap<String, Integer>();

//		String[] charArr = str.toLowerCase().split(""); //for distinct case

//		String[] charArr = str.toLowerCase().split(""); //for lower case

		String[] charArr = str.toUpperCase().split(""); // for upper case
//		System.out.println("sentence length: " + charArr.length);

		for (String charIndex : charArr) {

//			System.out.println("Char: " + charIndex);

			if (charCount.containsKey(charIndex)) {
				charCount.put(charIndex, charCount.get(charIndex) + 1);
			} else {
				charCount.put(charIndex, 1);
			}

		}

		Iterator<String> it = charCount.keySet().iterator();

		while (it.hasNext()) {
			String currKey = it.next();
			System.out.println("Key: " + currKey + " Value: " + charCount.get(currKey) + "");

		}

	}
}
