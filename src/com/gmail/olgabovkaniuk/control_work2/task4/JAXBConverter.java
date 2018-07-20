package com.gmail.olgabovkaniuk.control_work2.task4;

import lesson21.src.com.gmail.aperavoznikau.jaxb.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBConverter implements ParserService{
    public void marshall() {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("test");
        customer.setAge(29);
        try {
            File file = new File("src/com/gmail/olgabovkaniuk/control_work2/task3/shiporder.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public void parse() {
        try {
            File file = new File("src/com/gmail/olgabovkaniuk/control_work2/task3/shiporder.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Shiporder.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Shiporder shiporder = (Shiporder) jaxbUnmarshaller.unmarshal(file);
            System.out.println(shiporder);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }

    }
}
