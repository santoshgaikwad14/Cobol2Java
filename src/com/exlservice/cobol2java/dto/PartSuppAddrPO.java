package com.exlservice.cobol2java.dto;

import java.util.ArrayList;
import java.util.List;

public class PartSuppAddrPO {

    private Parts parts;
    private Suppliers suppliers;

    private List<SuppAdd> suppAddLists = new ArrayList<>();

    private  List<PurchaseOrder> purchaseOrderList = new ArrayList<>() ;

    public Parts getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts = parts;
    }

    public Suppliers getSupplier() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public List<SuppAdd> getSuppAddLists() {
        return suppAddLists;
    }

    public void addSuppAddLists(SuppAdd suppAddLists) {
        this.suppAddLists.add(suppAddLists);
    }

    public List<PurchaseOrder> getPurchageOrderList() {
        return purchaseOrderList;
    }

    public void addPurchageOrderList(PurchaseOrder purchaseOrder) {
        this.purchaseOrderList.add(purchaseOrder);
    }
}
