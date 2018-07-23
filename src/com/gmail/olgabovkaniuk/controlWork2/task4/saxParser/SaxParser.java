package com.gmail.olgabovkaniuk.controlWork2.task4.saxParser;

import com.gmail.olgabovkaniuk.controlWork2.task4.ParserService;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser implements ParserService {
    public String parse() {
        DefaultHandler userHandler = new UserHandler();
        try {
            File inputFile = new File("src/com/gmail/olgabovkaniuk/controlWork2/purchaseOrder.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ((UserHandler) userHandler).getProductNameAndPriceInfo();
    }
}

