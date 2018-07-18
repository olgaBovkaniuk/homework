package com.gmail.olgabovkaniuk.bovkaniuk_21.saxParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

    private boolean bBook = false;
    private boolean bAuthor = false;
    private boolean bTitle = false;
    private boolean bGenre = false;
    private boolean bPrice = false;
    private boolean bPublishDate = false;
    private boolean bDescription = false;
    private Integer bookCount = 0;
    private Double sumBookPrice = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("book")) {
            String id = attributes.getValue("id");
            System.out.println("Book id: " + id);
            bBook = true;
        } else if (qName.equalsIgnoreCase("author")) {
            bAuthor = true;
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("genre")) {
            bGenre = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        } else if (qName.equalsIgnoreCase("publish_date")) {
            bPublishDate = true;
        } else if (qName.equalsIgnoreCase("description")) {
            bDescription = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("book")) {
            System.out.println("End Element: " + qName);
            System.out.println("-------------------------------------------------------");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (bBook) {
            bookCount++;
            bBook = false;
        } else if (bAuthor) {
            System.out.println("Author: " + new String(ch, start, length));
            bAuthor = false;
        } else if (bTitle) {
            System.out.println("Title: " + new String(ch, start, length));
            bTitle = false;
        } else if (bGenre) {
            System.out.println("Genre: " + new String(ch, start, length));
            bGenre = false;
        } else if (bPrice) {
            String value = new String(ch, start, length);
            System.out.println("Price: " + value);
            if (sumBookPrice != null) {
                sumBookPrice += Double.valueOf(value);
            } else {
                sumBookPrice = Double.valueOf(value);
            }
            bPrice = false;
        } else if (bPublishDate) {
            System.out.println("Publish date: " + new String(ch, start, length));
            bPublishDate = false;
        } else if (bDescription) {
            System.out.println("Description: " + new String(ch, start, length));
            bDescription = false;
        }
    }

    @Override
    public void endDocument() {
        System.out.println("Number of books is: " + bookCount);
        if (bookCount != 0) {
            System.out.println("Average of book prices: " + sumBookPrice / bookCount);
        } else {
            System.out.println("There is no books to count!");
        }
    }
}
