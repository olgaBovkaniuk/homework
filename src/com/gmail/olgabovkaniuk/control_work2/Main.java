package com.gmail.olgabovkaniuk.control_work2;

import com.gmail.olgabovkaniuk.control_work2.task1.SingletonService;
import com.gmail.olgabovkaniuk.control_work2.task2.TestSingletonService;
import com.gmail.olgabovkaniuk.control_work2.task4.*;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

//        app.test1();

//        app.test2();

//        test3();

//        app.test4();

//        app.test5();

//        app.test6();

        app.test7();
    }

    private void test1() {
        SingletonService singletonService = SingletonService.getInstance();
        singletonService.runThreads(10);
    }

    private void test2() {
        TestSingletonService singletonService = TestSingletonService.getInstance();
        List<String> stringList = singletonService.runWriteToFileThreads(3, 10);
        List<Integer> integerList = singletonService.runReadFromFileThreads(stringList, 3);
        singletonService.averageMaxElemFromFiles(integerList);
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

    private static void test3() {
        try (
                InputStream xml = new FileInputStream("src/com/gmail/olgabovkaniuk/control_work2/task3/shiporder.xml");
                InputStream xsd = new FileInputStream("src/com/gmail/olgabovkaniuk/control_work2/task3/shiporderSchema.xsd")
        ) {
            System.out.println("Validation xml against XSD: " + validateAgainstXSD(xml, xsd));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void test4() {
        DomParser domParser = new DomParser();
        domParser.parse();
    }

    private void test5() {
        SaxParser saxParser = new SaxParser();
        saxParser.parse();
    }

    private void test6() {
        JAXBConverter jaxbConverter = new JAXBConverter();
        jaxbConverter.parse();
    }

    private void test7() {
        ParserFactory parserFactory = new ParserFactory();
        parserFactory.getParser(ParserEnum.JAXB).parse();
        parserFactory.getParser(ParserEnum.DOM).parse();
    }
}
