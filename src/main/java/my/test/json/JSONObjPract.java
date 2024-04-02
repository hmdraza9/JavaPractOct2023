package my.test.json;

import org.json.JSONArray;
import org.json.JSONObject;
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

//		System.out.println("JSON: " + jObj);

		String jsonString = JSONValue.toJSONString(jObj);

//		System.out.println("JSON: " + jsonString);

//		System.out.println("Data: ");
		System.out.println(jObjData);

		System.out.println("********decode********");

		Object obj = JSONValue.parse(jObjData.toString());

		JSONObject jsonObj = (JSONObject) obj;

		String data = (String)jsonObj.get("data.name");
		
		System.out.println("Data: "+data);

	}

}
