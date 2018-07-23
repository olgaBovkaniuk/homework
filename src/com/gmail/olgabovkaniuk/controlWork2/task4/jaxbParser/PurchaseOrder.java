package com.gmail.olgabovkaniuk.controlWork2.task4.jaxbParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "PurchaseOrder")
public class PurchaseOrder {
    private String orderDate;
    private List<Item> items = new ArrayList<>();

    public String getOrderDate() {
        return orderDate;
    }

    @XmlAttribute(name = "OrderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    @XmlElement(name = "Item")
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
