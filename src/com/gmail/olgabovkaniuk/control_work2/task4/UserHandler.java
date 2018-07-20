package com.gmail.olgabovkaniuk.control_work2.task4;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {
    boolean bTitle = false;
    boolean bPrice = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("item")) {
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("item")) {
            System.out.println("End Element :" + qName);
            System.out.println("----------------------------");
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {

        if (bTitle) {
            System.out.println("Title: " + new String(ch, start, length));
            bTitle = false;
        } else if (bPrice) {
            System.out.println("Price: " + new String(ch, start, length));
            bPrice = false;
        }
    }
}
