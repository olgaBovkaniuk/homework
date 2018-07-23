package com.gmail.olgabovkaniuk.controlWork2.task4.jaxbParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

public class Item {
    private String partNumber;
    private String productName;
    private Integer quantity;
    private BigDecimal usPrice;
    private String comment;
    private String shipDate;

    public String getPartNumber() {
        return partNumber;
    }

    @XmlAttribute(name = "PartNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getProductName() {
        return productName;
    }

    @XmlElement(name = "ProductName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @XmlElement(name = "Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUsPrice() {
        return usPrice;
    }

    @XmlElement(name = "USPrice")
    public void setUsPrice(BigDecimal usPrice) {
        this.usPrice = usPrice;
    }

    public String getComment() {
        return comment;
    }

    @XmlElement(name = "Comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipDate() {
        return shipDate;
    }

    @XmlElement(name = "ShipDate")
    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }
}
