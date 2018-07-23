package com.gmail.olgabovkaniuk.controlWork2.task4.jaxbParser;

import com.gmail.olgabovkaniuk.controlWork2.task4.ParserService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;

public class JAXBConverter implements ParserService {

    public String parse() {
        BigDecimal sumOfPrice = BigDecimal.valueOf(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        try {
            File file = new File("src/com/gmail/olgabovkaniuk/controlWork2/purchaseOrder.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseOrder.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            PurchaseOrder purchaseOrder = (PurchaseOrder) jaxbUnmarshaller.unmarshal(file);
            List<Item> items = purchaseOrder.getItems();
            for (Item item : items) {
                stringBuilder.append(item.getProductName()).append(" - ").append(item.getUsPrice()).append("; ");
                sumOfPrice = sumOfPrice.add(item.getUsPrice());
            }
            stringBuilder.append("total price: ").append(sumOfPrice).append("}");
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}

