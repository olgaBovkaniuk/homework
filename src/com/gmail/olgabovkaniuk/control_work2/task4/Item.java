package com.gmail.olgabovkaniuk.control_work2.task4;

import javax.xml.bind.annotation.XmlElement;

public class Item {
    private String title;
    private String note;
    private String quantity;
    private String price;

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    @XmlElement
    public void setNote(String note) {
        this.note = note;
    }

    public String getQuantity() {
        return quantity;
    }

    @XmlElement
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
