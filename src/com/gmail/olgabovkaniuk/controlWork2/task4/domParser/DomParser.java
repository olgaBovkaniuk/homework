package com.gmail.olgabovkaniuk.controlWork2.task4.domParser;

import com.gmail.olgabovkaniuk.controlWork2.task4.ParserService;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.math.BigDecimal;

public class DomParser implements ParserService {
    public String parse() {
        BigDecimal sumOfPrice = BigDecimal.valueOf(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        try {
            File inputFile = new File("src/com/gmail/olgabovkaniuk/controlWork2/purchaseOrder.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Item");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    stringBuilder.append(eElement
                            .getElementsByTagName("ProductName")
                            .item(0)
                            .getTextContent());
                    stringBuilder.append(" - ")
                            .append(eElement
                            .getElementsByTagName("USPrice")
                            .item(0)
                            .getTextContent())
                            .append("; ");
                    sumOfPrice = sumOfPrice.add(BigDecimal.valueOf(Double.valueOf(eElement
                            .getElementsByTagName("USPrice")
                            .item(0)
                            .getTextContent())));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        stringBuilder.append("total price: ").append(sumOfPrice).append("}");
        return stringBuilder.toString();
    }
}

