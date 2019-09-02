/*
 * @author: bzr
 * @date:2.9.2019
 */
import javax.xml.XMLConstants;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.*;
import java.io.*;
import org.w3c.dom.*;
import org.apache.xml.serializer.*;
import org.dom4j.io.OutputFormat;

public class Router {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException 
	{
			/* Allow Reading of that file*/
		 // create a new DocumentBuilderFactory
	      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	      try {
	         // use the factory to create a documentbuilder
	         DocumentBuilder builder = factory.newDocumentBuilder();

	         // create a new document from input source
	         FileInputStream fis = new FileInputStream("possibleroutes.xml");
	         InputSource is = new InputSource(fis);
	         Document doc = builder.parse(is);

	         // get the first element
	         Element element = doc.getDocumentElement();

	         // get all child nodes
	         NodeList nodes = element.getChildNodes();

	         // print the text content of each child
	         for (int i = 0; i < nodes.getLength(); i++) {
	            System.out.println("" + nodes.item(i).getTextContent());
	         }
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
		
	}

}
