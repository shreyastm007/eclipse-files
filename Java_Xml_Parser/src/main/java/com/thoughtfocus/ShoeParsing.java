package com.thoughtfocus;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ShoeParsing {

	public static void main(String[] args) {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(new File("shoes.xml"));
			document.getDocumentElement().normalize();

			NodeList shoeList = document.getElementsByTagName("shoe");

			for (int i = 0; i < shoeList.getLength(); i++) {

				Node shoe = shoeList.item(i);

				if (shoe.getNodeType() == Node.ELEMENT_NODE) {

					Element shoeElement = (Element) shoe;
					System.out.println("Shoe Name:" + shoeElement.getAttribute("Name"));

					NodeList shoeDetails = shoe.getChildNodes();
					for (int j = 0; j < shoeDetails.getLength(); j++) {
						Node detail = shoeDetails.item(j);

						if (detail.getNodeType() == Node.ELEMENT_NODE) {
							Element detailElement = (Element) detail;
							System.out.println(
									"     " + detailElement.getTagName() + ": " + detailElement.getAttribute("value"));
						}

					}
				}

			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
