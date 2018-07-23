package com.gmail.olgabovkaniuk.controlWork2.task4;

import com.gmail.olgabovkaniuk.controlWork2.task4.domParser.DomParser;
import com.gmail.olgabovkaniuk.controlWork2.task4.jaxbParser.JAXBConverter;
import com.gmail.olgabovkaniuk.controlWork2.task4.saxParser.SaxParser;

public class ParserFactory {
    public ParserService getParser(ParserEnum parserEnum) {
        switch (parserEnum) {
            case DOM:
                return new DomParser();
            case SAX:
                return new SaxParser();
            case JAXB:
                return new JAXBConverter();
        }
        throw new RuntimeException("Not supported value of enum:" + parserEnum);
    }
}
