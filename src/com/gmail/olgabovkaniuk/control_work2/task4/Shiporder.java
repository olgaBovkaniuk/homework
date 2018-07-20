package com.gmail.olgabovkaniuk.control_work2.task4;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "shiporder")
public class Shiporder {
    private String orderid;
    private Shipto shipto;
    private List<Item> items = new ArrayList<>();

    public String getOrderid() {
        return orderid;
    }

    @XmlAttribute(name = "orderid")
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Shipto getShipto() {
        return shipto;
    }

    @XmlElement(name = "shipto")
    public void setShipto(Shipto shipto) {
        this.shipto = shipto;
    }

    public List<Item> getItems() {
        return items;
    }

    @XmlElement(name = "item")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Shiporder{" +
                "shipto=" + shipto +
                ", items=" + items +
                '}';
    }
}
