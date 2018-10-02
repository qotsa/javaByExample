package qotsa.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SmevRequestParser {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();


        Document document = builder.parse(new File("smev3Request.xml"));
        Document signature = builder.parse(new File("signature.xml"));



        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        Node body = root.getElementsByTagName("soap:Body").item(0);

        System.out.println(body.getNodeName());

        NodeList nodeList = root.getChildNodes();




    }
}
