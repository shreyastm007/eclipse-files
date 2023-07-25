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

public class XmlParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(new File("BookStore.xml"));

			document.getDocumentElement().normalize();

			NodeList bookList = document.getElementsByTagName("book");
			for (int i = 0; i < bookList.getLength(); i++) {
				Node book = bookList.item(i);

				if (book.getNodeType() == Node.ELEMENT_NODE) {

					Element bookElement = (Element) book;
					System.out.println("Book Name: " + bookElement.getAttribute("name"));

					NodeList bookDetails = book.getChildNodes();
					for (int j = 0; j < bookDetails.getLength(); j++) {
						Node detail = bookDetails.item(j);
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
