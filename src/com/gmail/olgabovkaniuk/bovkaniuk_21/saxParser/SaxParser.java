package com.gmail.olgabovkaniuk.bovkaniuk_21.saxParser;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser {
    public void saxParser() {
        try {
            File inputFile = new File("src/com/gmail/olgabovkaniuk/bovkaniuk_21/booksCatalog.xml");
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = parserFactory.newSAXParser();
            DefaultHandler userHandler = new UserHandler();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
