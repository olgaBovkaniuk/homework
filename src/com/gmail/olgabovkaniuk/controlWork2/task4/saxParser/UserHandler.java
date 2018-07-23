package com.gmail.olgabovkaniuk.controlWork2.task4.saxParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.math.BigDecimal;

public class UserHandler extends DefaultHandler {
    private boolean bProductName = false;
    private boolean bUSPrice = false;
    private BigDecimal sumOfPrice = BigDecimal.valueOf(0);

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("PurchaseOrder")) {
            stringBuilder.append("{");
        } else if (qName.equalsIgnoreCase("ProductName")) {
            bProductName = true;
        } else if (qName.equalsIgnoreCase("USPrice")) {
            bUSPrice = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("Item")) {
            stringBuilder.append("; ");
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {

        if (bProductName) {
            stringBuilder.append(new String(ch, start, length));
            bProductName = false;
        } else if (bUSPrice) {
            stringBuilder.append(" - ").append(new String(ch, start, length));
            String value = new String(ch, start, length);
            sumOfPrice = sumOfPrice.add(BigDecimal.valueOf(Double.valueOf(value)));
            bUSPrice = false;
        }
    }

    @Override
    public void endDocument() {
        stringBuilder.append("total price: ").append(sumOfPrice).append("}");
    }

    public String getProductNameAndPriceInfo() {
        return stringBuilder.toString();
    }
}
