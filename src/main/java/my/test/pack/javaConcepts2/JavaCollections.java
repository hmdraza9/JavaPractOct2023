package my.test.pack.javaConcepts2;

import java.util.Map;
import java.util.TreeMap;

public class JavaCollections {

	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("7", "c");
		tm.put("E", "e");
		tm.put("A", "a");
		tm.put("1", "z");
		tm.put("B", "b");
		tm.put("c", "c");
		tm.put("", "");

		System.out.println(tm.size() + ", Tree: " + (tm.get("z") == null) + " " + ("" == null));
	}
}
