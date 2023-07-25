package com.thoughtfocus;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {

	public static void main(String[] args) {

		String xmlStr = "<student>\r\n" + "	<firstName>John</firstName>\r\n" + "	<id>1</id>\r\n"
				+ "	<lastName>Smith</lastName>\r\n" + "</student>";
		System.out.println("The XML format is:" + xmlStr);

		// code to convert xml to json:
		JSONObject json = XML.toJSONObject(xmlStr);

		System.out.println("The JSON format is:" + json);
	}

}
