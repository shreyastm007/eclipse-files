package com.thoughtfocus;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

	public static void main(String[] args) {

		String jsonStr = "{\r\n" + "	employee : {\r\n" + "		\"emp_id\":1,\r\n" + "		\"name\":\"John\",\r\n"
				+ "		\"cmpName\":\"TATA\"\r\n" + "	}\r\n" + "}";
		System.out.println("The JSON format is:" + jsonStr);

		// code to convert json to xml:
		JSONObject json = new JSONObject(jsonStr);

		System.out.println("The XML format is:" + XML.toString(json));
	}

}
