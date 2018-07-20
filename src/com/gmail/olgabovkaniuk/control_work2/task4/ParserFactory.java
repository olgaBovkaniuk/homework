package com.gmail.olgabovkaniuk.control_work2.task4;

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
