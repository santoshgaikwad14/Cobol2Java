package com.exlservice.cobol2java.parsers;


import com.exlservice.cobol2java.dto.*;

public class PartSuppAddrParser {

    public static PartSuppAddrPO parse(String dataLine) {

        //PartSuppAddrPO partSuppAddrPO = new PartSuppAddrPO();
        Parts parts = new Parts(dataLine);
        Suppliers suppliers = new Suppliers(dataLine);

        SuppAdd suppAdd1 = new SuppAdd(dataLine,1);
        SuppAdd suppAdd2 = new SuppAdd(dataLine, 2);
        SuppAdd suppAdd3 = new SuppAdd(dataLine, 3);

        PurchaseOrder purchaseOrder1 = new PurchaseOrder(dataLine,1);
        PurchaseOrder purchaseOrder2 = new PurchaseOrder(dataLine,2);
        PurchaseOrder purchaseOrder3 = new PurchaseOrder(dataLine,3);

       // Parts parts, Supplier supplier, List< SuppAdd > suppAddLists, List< PurchageOrder > purchageOrderList

        PartSuppAddrPO partSuppAddrPO = new PartSuppAddrPO();
        partSuppAddrPO.setParts(parts);
        partSuppAddrPO.setSuppliers(suppliers);
        partSuppAddrPO.addSuppAddLists(suppAdd1);
        partSuppAddrPO.addSuppAddLists(suppAdd2);
        partSuppAddrPO.addSuppAddLists(suppAdd3);
        partSuppAddrPO.addPurchageOrderList(purchaseOrder1);
        partSuppAddrPO.addPurchageOrderList(purchaseOrder2);
        partSuppAddrPO.addPurchageOrderList(purchaseOrder3);

        return partSuppAddrPO;

    }
}
