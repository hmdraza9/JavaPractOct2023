package my.test.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONObjPract {

	public static void main(String[] args) {
		JSONObject jObjData = new JSONObject();
		JSONObject jObj = new JSONObject();
		jObj.put("name", "nick");
		jObj.put("surname", "chaube");
		jObj.put("city", "negro");
		jObj.put("nickname", "nicks");
		jObj.put("home", "LA");

		JSONArray jArr = new JSONArray();
		jArr.put(false);
		jArr.put(false);
		jArr.put(true);
		jArr.put(false);
		jArr.put(true);

		jObjData.put("data", jObj);

		jObj.put("results", jArr);

		System.out.println("JSON: " + jObj);

		String jsonString = JSONValue.toJSONString(jObj);

		System.out.println("JSON: " + jsonString);

		System.out.println("Data1: ");
		System.out.println(jObjData);

		System.out.println("********decode********");

		Object obj = JSONValue.parse(jObjData.toString());

		JSONObject jsonObj = (JSONObject) obj;

		System.out.println("Data21: " + jsonObj.get("data.name"));
		System.out.println("Data22: " + jsonObj.get("data"));

		Object obj2 = jsonObj.get("data");

		JSONObject jsonObj2 = (JSONObject) obj2;

		System.out.println("Data.name: " + jsonObj2.get("name"));
		System.out.println("Data.surname: " + jsonObj2.get("surname"));
		System.out.println("Data.results: " + jsonObj2.get("results"));

//		String data = jsonObj.get("data.name").toString();

//		System.out.println("Data2: " + data);

		testss();
		JSONfromMAP();
		otherJSON();

	}

	public static void testss() {
		String s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
		Object obj = JSONValue.parse(s);
		JSONObject jsonObject = (JSONObject) obj;

		String name = (String) jsonObject.get("name");
		double salary = (Double) jsonObject.get("salary");
		long age = (Long) jsonObject.get("age");
		System.out.println(name + " " + salary + " " + age);
	}

	public static void JSONfromMAP() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "John");
		map.put("Age", "22");
		map.put("City", "LA");
		map.put("Country", "USA");

		JSONObject jObj = new JSONObject(map);

		System.out.println("JSON from MAP: " + jObj);
	}

	public static void otherJSON() {
		// In java JSONObject is used to create JSON object
		// which is a subclass of java.util.HashMap.

		JSONObject file = new JSONObject();

		JSONArray Subjects = new JSONArray();
		Map<String, String> subRating = new HashMap<String, String>();
		subRating.put("Hindi", String.valueOf(77.1f) + "%");
		subRating.put("English", String.valueOf(88.5f) + "%");
		subRating.put("Maths", String.valueOf(96.7f) + "%");

		Subjects.put(subRating);

		file.put("Full Name", "Ritu Sharma");
		file.put("Roll No.", new Integer(1704310046));
		file.put("Tuition Fees", new Double(65400));
		file.put("Subjects", Subjects);
		file.put("CGPA", new Float(8.76335));

		// To print in JSON format.
		System.out.print("file: \n" + file);
	}

}
