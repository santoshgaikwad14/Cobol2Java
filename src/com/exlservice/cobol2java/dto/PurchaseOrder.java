package com.exlservice.cobol2java.dto;

public class PurchaseOrder {
    private String poNumber;
    private String buyerCode;
    private int quantity;
    private double unitPrice;
    private int orderDate;
    private int deliveryDate;


    public PurchaseOrder(String dataLine, int i) {
        if (i==1) {
            this.poNumber = dataLine.substring(347, 353);
            this.buyerCode = dataLine.substring(353, 356);
            this.quantity = Integer.parseInt(dataLine.substring(356, 363));
            this.unitPrice = Float.parseFloat(dataLine.substring(363, 371));
            this.orderDate = Integer.parseInt(dataLine.substring(372, 380));
            this.deliveryDate = Integer.parseInt(dataLine.substring(380, 388));
        }

        else if (i==2){
            this.poNumber = dataLine.substring(388, 394);
            this.buyerCode = dataLine.substring(394, 397);
            this.quantity = Integer.parseInt(dataLine.substring(397, 404));
            this.unitPrice = Float.parseFloat(dataLine.substring(404, 413));
            this.orderDate = Integer.parseInt(dataLine.substring(413, 421));
            this.deliveryDate = Integer.parseInt(dataLine.substring(421, 429));
        }

        else if (i==3){
            this.poNumber = dataLine.substring(429, 435);
            this.buyerCode = dataLine.substring(435, 438);
            this.quantity = Integer.parseInt(dataLine.substring(438, 445));
            this.unitPrice = Float.parseFloat(dataLine.substring(445, 454));
            this.orderDate = Integer.parseInt(dataLine.substring(454, 462));
            this.deliveryDate = Integer.parseInt(dataLine.substring(462, 470));
        }

    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public int getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
