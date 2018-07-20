package com.gmail.olgabovkaniuk.control_work2.task4;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser implements ParserService{
    public void parse() {
        try {
            File inputFile = new File("src/com/gmail/olgabovkaniuk/control_work2/task3/shiporder.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
