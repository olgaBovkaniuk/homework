package com.gmail.olgabovkaniuk.controlWork2;

import com.gmail.olgabovkaniuk.controlWork2.task4.ParserEnum;
import com.gmail.olgabovkaniuk.controlWork2.task4.ParserFactory;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.test3();

        app.test4();

    }

    private static boolean validateAgainstXSD(InputStream xml, InputStream xsd) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private void test3() {
        try (
                InputStream xml = new FileInputStream("src/com/gmail/olgabovkaniuk/controlWork2/purchaseOrder.xml");
                InputStream xsd = new FileInputStream("src/com/gmail/olgabovkaniuk/controlWork2/purchaseOrder.xsd")
        ) {
            System.out.println("Validation xml against XSD: " + validateAgainstXSD(xml, xsd));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void test4() {
        ParserFactory parserFactory = new ParserFactory();
        System.out.println(parserFactory.getParser(ParserEnum.DOM).parse());
        System.out.println(parserFactory.getParser(ParserEnum.SAX).parse());
        System.out.println(parserFactory.getParser(ParserEnum.JAXB).parse());
    }
}
